package day01;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-11 19:17
 */
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[1000];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print((a[i] + a[i + 1]) / 2 + " ");
            } else {
                if (i == n - 1) {
                    System.out.print((a[i] + a[i - 1]) / 2 + " ");
                } else {
                    System.out.print((a[i] + a[i - 1]+a[i+1])/3+" ");
                }
            }
        }
    }
}
