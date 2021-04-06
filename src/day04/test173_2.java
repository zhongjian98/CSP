package day04;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-16 19:10
 */
public class test173_2 {
    static int N = 1000;
    public static void main(String[] args) {
        int[] sno2pos = new int[N + 1];// 学号所在位置
        int[] pos2sno = new int[N + 1];// 位置上的学号

        int n, m, p, q;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // 初始化
        for (int i = 1; i <= n; i++) {
            sno2pos[i] = i;
            pos2sno[i] = i;
        }

        // 模拟移动过程
        for (int i = 1; i <= m; i++) {
            int pos1, pos2 = 0, sno2;

            p = sc.nextInt();
            q = sc.nextInt();

            if (q != 0) {
                int move = (q > 0) ? 1 : -1;
                int end = (q > 0) ? q : -q;

                pos1 = sno2pos[p];
                for (int j = 1; j <= end; j++) {
                    sno2 = pos2sno[pos1 + move];
                    pos2 = sno2pos[sno2];

                    pos2sno[pos1] = sno2;
                    sno2pos[sno2] = pos1;

                    pos1 = pos2;
                }
                pos2sno[pos2] = p;
                sno2pos[p] += q;
            }
        }

        // 让空格和数字成对打印，避免空格落空，造成结果不匹配
        System.out.print(pos2sno[1]);
        for (int i = 2; i <= n; i++) {
            System.out.print(" " + pos2sno[i]);
        }


    }
}
