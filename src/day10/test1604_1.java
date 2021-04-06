package day10;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-02 12:42
 */
public class test1604_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;

        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] >a[i + 1]) {
                count++;
            }
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
