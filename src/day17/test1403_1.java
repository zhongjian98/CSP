package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 12:14
 */
public class test1403_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[505];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] != a[j] && a[i] == -a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
