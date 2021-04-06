package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 17:00
 */
public class test1909_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[1005][1005];
        int k=0;
        int p=0;
        int max=0;
        int t=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                a[i][j] = scanner.nextInt();
                t+= a[i][j];
            }
            for (int j = 1; j < m + 1; j++) {
                max += Math.abs(a[i][j]);
            }
            if (p < max) {
                k = i+1;
                p=max;
            }
            max=0;

        }
        System.out.println(t+" "+k+" "+p);
    }
}
