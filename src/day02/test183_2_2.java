package day02;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-12 11:03
 */
public class test183_2_2 {



        static long sum = 0;//计时器，同时也是所用时间之和。
        static int r,g,y;
        public static void kind(int kind,long left) {//kind既是灯的颜色，left为信号灯显示的剩余时间
            switch(kind) {
                case 1:
                    sum +=left;
                    break;
                case 2:
                    sum+=left+r;
                    break;
                case 3:
                    break;
            }
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);
            r= scan.nextInt();
            y= scan.nextInt();
            g = scan.nextInt();
            scan.nextLine();
            String n_s = scan.nextLine();
            int n = Integer.parseInt(n_s);
            int[] kinds=new int[n];
            int[] left_time=new int[n];
            for (int i=0;i<n-1;i++) {
                String line=scan.nextLine();
                String[] arr = line.split(" ");
                kinds[i]=Integer.parseInt(arr[0]);
                left_time[i] = Integer.parseInt(arr[1]);
            }
            kinds[n-1]=scan.nextInt();
            left_time[n-1]=scan.nextInt();//忽略这段睿智的处理输入代码....
            scan.close();
            int all = r+y+g;
            for(int i = 0;i<n;i++) {
                switch(kinds[i]) {
                    case 0:
                        sum=sum+left_time[i];
                        break;
                    case 1://如果出发时是红灯
                        long temp_left= (sum+(r-left_time[i]))%all;//以红灯开始亮为起始点，计算到达路口时时间落在[0,r),还是[r,r+g),[r+g,r+g+y)
                        if(temp_left<r) {
                            kind(1,r-temp_left);//计算出是红灯，交给kind方法
                        }else if(temp_left<r+g) {
                            kind(3,r+g-temp_left);
                        }else if(temp_left<r+g+y) {
                            kind(2,r+g+y-temp_left);
                        }
                        break;
                    case 2:
                        temp_left= (sum+(y-left_time[i]))%all;//以黄灯开始亮为起始点，计算到达路口时时间落在[0,y),还是[y,r+y),[r+y,r+y+g)
                        if(temp_left<y) {
                            kind(2,y-temp_left);
                        }else if(temp_left<y+r) {
                            kind(1,y+r-temp_left);
                        }else if(temp_left<r+g+y) {
                            kind(3,r+g+y-temp_left);
                        }
                        break;
                    case 3:

                        temp_left= (sum+(g-left_time[i]))%all;
                        if(temp_left<g) {
                            kind(3,g-temp_left);
                        }else if(temp_left<y+g) {
                            kind(2,y+g-temp_left);
                        }else if(temp_left<r+g+y) {
                            kind(1,r+g+y-temp_left);
                        }
                        break;
                }
            }
            System.out.println(sum);
        }

    }


