package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-02 13:18
 */
public class test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max=0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i - 1]) > max) {
                max=Math.abs(a[i] - a[i - 1]);
            }
        }
        System.out.println(max);
    }
}
