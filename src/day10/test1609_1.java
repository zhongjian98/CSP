package day10;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-02 12:50
 */
public class test1609_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max=0;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) > max) {
                max = Math.abs(a[i] - a[i + 1]);
            }
        }
        System.out.println(max);
    }
}
