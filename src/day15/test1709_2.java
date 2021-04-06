package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-09 20:41
 */
//1.找出全体老师中的最后一节课结束的时间
//2.存储每个老师借的钥匙、上课开始时刻、下课结束时刻
//3.循环时间到最后时刻，分析每一时刻的借还钥匙情况，根据题意进行处理
//4.注意同一时刻多个老师还钥匙的情况（由小到大进行还钥匙；且全部还完再进行借钥匙）
//5.经分析，题目似乎不包含同一时刻多名老师借钥匙的情况，故不考虑在内。
public class test1709_2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        // 钥匙数组信息
        int[] key = new int[n];
        for (int i = 0; i < n; i++) {
            key[i] = i + 1;
        }

        // 存储老师上课信息
        int[][] array = new int[m][3];

        // 找出最晚一节课结束的时刻
        int max = 0;
        for (int i = 0; i < m; i++) {
            array[i][0] = scan.nextInt(); // 钥匙编号
            array[i][1] = scan.nextInt(); // 上课开始时刻
            array[i][2] = scan.nextInt() + array[i][1]; // 下课结束时刻
            if (array[i][2] > max) {
                max = array[i][2];
            }
        }

        // 把老师顺序按上课开始时间从早到晚排序(选择排序)
        for (int i = 0; i < m; i++) {
            int min = i;
            for (int j = i + 1; j < m; j++) {
                if (array[j][1] < array[i][1]) {
                    min = j;
                }
            }
            if (min != i) {
                int[] tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
            System.out.print(array[i][0]+" "+array[i][1]+" ");
        }

        // 开始拿钥匙
        for (int i = 1; i <= max; i++) { // 循环每一时刻
            ArrayList<Integer> back = new ArrayList<Integer>(); // 该时刻要还回去的钥匙集合
            for (int j = 0; j < m; j++) {
                if (array[j][2] == i) {
                    back.add(array[j][0]);
                }
            }
            // 升序,将要还回去的钥匙集合按钥匙编号升序排列
            Collections.sort(back);

            // 先全部还完钥匙
            for (int j = 0; j < back.size(); j++) {
                for (int k = 0; k < n; k++) {
                    if (key[k] == 0) {
                        key[k] = back.get(j);
                        break;
                    }
                }
            }

            // 开始借钥匙（题目不存在同一时刻多个老师都借钥匙的情况）
            for (int j = 0; j < m; j++) {
                if (array[j][1] == i) {
                    for (int k = 0; k < n; k++) {
                        if (key[k] == array[j][0]) {
                            key[k] = 0;
                        }
                    }
                }
            }
        }

        // 打印最后钥匙的排序
//        for (int i = 0; i < n; i++) {
//            System.out.print(key[i] + " ");
//        }

        scan.close();
    }
}
