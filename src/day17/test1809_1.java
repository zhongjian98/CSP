package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 16:05
 */
public class test1809_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        int b[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 ) {
                b[i] = (a[i] + a[i + 1]) / 2;
                continue;
            }
            if (i == n-1) {
                b[i] = (a[i] + a[i - 1]) / 2;
                continue;
            }
            b[i] = (a[i - 1] + a[i] + a[i + 1]) / 3;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }

    }
}
