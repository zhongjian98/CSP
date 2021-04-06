package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 13:56
 */
public class test1609_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i <n ; i++) {
            if (max < Math.abs(a[i] - a[i -1])) {
                max = Math.abs(a[i] - a[i - 1]);
            }
        }
        System.out.println(max);
    }
}
