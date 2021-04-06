package day10;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-02 12:56
 */
public class test1712_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int min=10000;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && Math.abs(a[i] - a[j]) < min) {
                    min = Math.abs(a[i] - a[j]);
                }
            }
        }
        System.out.println(min);
    }
}
