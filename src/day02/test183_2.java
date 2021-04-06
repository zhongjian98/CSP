package day02;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author zhongyanzu
 * @create 2020-11-12 10:36
 */
public class test183_2 {




        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);

            // 红1 黄2 绿3 无灯0
            int R = ip.nextInt();// R 完整红灯的时间
            int Y = ip.nextInt();// Y 完整黄灯的时间
            int G = ip.nextInt();// G 完整绿灯的时间

            // 通过的路段数  包括红绿灯路段 和 无灯路段
            int LIGHTNUM = ip.nextInt();

            /*
             *   初始化路段集合
             *   R 完整红灯的时间
             *   Y 完整黄灯的时间
             *   G 完整绿灯的时间
             * */
            LightList LL = new LightList(R,Y,G);

            int lightColor,lightTime;

            for (int i = 0; i < LIGHTNUM ; i++) {
                lightColor = ip.nextInt(); // 灯颜色
                lightTime = ip.nextInt(); // 灯的剩余倒计时

                // 向集合添加一个路段 (灯颜色 + 灯的剩余时间) -> 一个路段
                LL.addLight(lightColor,lightTime);
            }

            // 打印最终结果
            LL.printSUM();

        }

        static class LightList {
            long SUM = 0; // 已用时间
            int passLightNum = 0; // 已经过的路段数
            ArrayList<LightNode> LL; // 存储所有路段 出发时的 灯颜色 + 灯倒计时
            int R,Y,G;

            LightList(int R,int Y,int G) {
                this.R = R;// R 完整红灯的时间
                this.Y = Y;// Y 完整黄灯的时间
                this.G = G;// G 完整绿灯的时间
                this.LL = new ArrayList<>();
            }

            // 创建一个路段
            void addLight(int lightColor, int lightTime) {
                LightNode LN = new LightNode(lightColor,lightTime,this.R,this.Y,this.G);
                LL.add(LN); // 将路段添加到LightList中
                LightNode nowLN = LL.get(passLightNum); // 现在正在走的路段
                this.SUM = nowLN.changeLightColor(this.SUM); // 获取走完该路段之后，最新的已用时间
                this.passLightNum ++;
            }

            void printSUM() {
                System.out.println(this.SUM);
            }
        }

        static class LightNode {
            static int R;
            static int Y;
            static int G;
            int lightColor; // 0直接通过 红1 黄2 绿3
            int lightTime; // 灯倒计时时间

            /*
             *   初始化所有路段
             *   lightColor 灯的颜色  用于创建一个路段
             *   lightTIme 灯的倒计时  用于创建一个路段
             *   R 红灯的完整倒计时
             *   Y 黄灯的完整倒计时
             *   G 绿灯的完整倒计时
             * */
            LightNode(int lightColor, int lightTime,int R,int Y,int G) {
                LightNode.R = R;
                LightNode.Y = Y;
                LightNode.G = G;
                this.lightColor = lightColor;
                this.lightTime = lightTime;
            }


            /*
             *   改变现在路段的灯颜色和灯倒计时 然后计算
             *   形参：已用时间
             *   return：最新已用时间
             * */
            long changeLightColor(long sum) {
                // sum为小明到达该路段时，之前走过的所有路段的秒数
                long cpSum = sum;

                // 如果为无灯路段 则直接通过 并加上通过所需时长
                if (this.lightColor == 0) {
                    sum += this.lightTime;
                }
                // 如果为红绿灯路段
                else {
                    // 没有这一步会运行超时
                    // 解释：假如 三个灯的总倒计时时长为 time，则小明每走过一次time秒，所有红绿灯回归原来的倒计时
                    cpSum %= (LightNode.G + LightNode.R + LightNode.Y);

                    /*
                     *   计算到达该路段时，该路段现在的 (灯颜色 和 灯倒计时秒数)
                     *
                     *   如果cspSum - this.lightTime > 0,
                     *   说明小明到达该红绿灯路段所用的时间已经超过该路段原本的倒计时,
                     *   则应该切换灯以及更新倒计时并更新灯的倒计时。
                     * */
                    while ((cpSum -= this.lightTime) > 0) {
                        if (this.lightColor == 1) {
                            this.lightColor = 3;
                            this.lightTime = LightNode.G;
                        }else if (this.lightColor == 3) {
                            this.lightColor = 2;
                            this.lightTime = LightNode.Y;
                        }else if (this.lightColor == 2) {
                            this.lightColor = 1;
                            this.lightTime = LightNode.R;
                        }
                    }

                    // 因为while语句执行判断之后cpSum -= this.lightTime最后会被多执行一次,所以这里要加回来
                    // 如果cpSum还有剩余的时间但不超过总倒计时 则该路段的灯的现倒计时应该减去cpSum
                    if ((cpSum += this.lightTime) > 0) {
                        this.lightTime -= cpSum;
                    }

                    // 最后如果是红灯 则需等待lightTime秒
                    if (this.lightColor == 1) {
                        sum += lightTime;
                    }
                    // 最后如果是黄灯，则需等待lightTime秒 + 一段红灯的完整倒计时
                    else if (this.lightColor == 2) {
                        sum += lightTime + LightNode.R;
                    }

                }

                // 返回回家已用时长
                return sum;
            }
        }
    }



