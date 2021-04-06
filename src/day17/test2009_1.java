package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 19:47
 */
public class test2009_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double a[] = new double[200];
        int b[] = new int[200];
        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            a[i] = ((x - x1) * (x - x1) + (y - y1) * (y - y1));
            b[i] = i + 1;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    int tmp=0;
                    tmp = b[j+1];
                    b[j + 1] = b[j];
                    b[j] = tmp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
    }
}
