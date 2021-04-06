package day09;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-01 13:06
 */
public class test1409_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == 1) {
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
