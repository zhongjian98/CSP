package day01;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-11 16:32
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int max=-1,T=0,k=0,P=0;
        int[][] a= new int[N][M + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + 1; j++) {
                a[i][j] = scanner.nextInt();
                T += a[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 1; j < a[i].length; j++) {
                sum += Math.abs(a[i][j]);
            }
            if (sum > max) {
                max=sum;
                P = max;
                k = i + 1;
            }

        }
        System.out.println(T+" "+k+" "+P);
    }
}
