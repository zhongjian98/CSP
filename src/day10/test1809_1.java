package day10;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-02 15:30
 */
public class test1809_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        int b[] = new int[1005];
        for (int i = 1; i <=n; i++) {
            if (i == 1 ) {
                b[i] = (a[i] + a[i + 1]) / 2;
            } else if (i == n) {
                b[i] = (a[i] + a[i - 1]) / 2;
            } else {
                b[i] = (a[i] + a[i - 1] + a[i + 1]) / 3;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
