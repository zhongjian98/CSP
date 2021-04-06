package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 15:21
 */
public class test1803_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[40];
        int b[] = new int[40];
        int sum=0;
        int x = scanner.nextInt();
        int t=0;
        while (x != 0) {
            a[t] = x;
            t = t + 1;
            x = scanner.nextInt();

        }
        for (int i = 0; i < t; i++) {
            if (a[i] == 1) {
                b[i] = 1;
            }
            if (a[i] == 2 && i != 0) {
                if (a[i - 1] != 2) {
                    b[i] = 2;
                }
                if (a[i - 1] == 2) {
                    b[i] = b[i - 1] + 2;
                }
            }
        }
        if (a[0] == 2) {
            b[0] = 2;
        }
        for (int i = 0; i < t; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
