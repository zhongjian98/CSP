package day09;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-01 12:45
 */
public class test1403_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[505];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] != a[j] && Math.abs(a[i]) == Math.abs(a[j])) {
                    c++;
                }
            }
        }
        System.out.println(c/2);
    }
}
