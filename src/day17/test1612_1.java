package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 14:08
 */
public class test1612_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1000];
        int flag = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int max=0;
            int min=0;
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    max++;
                }
                if (a[i] < a[j]) {
                    min++;
                }
            }
            if (max == min) {
                System.out.println(a[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
