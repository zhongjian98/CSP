package day09;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-01 15:06
 */
public class test159_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 0;
        
        for (int i = 0; i < n-1; i++) {
            if (a[i] == a[i + 1]) {
                if (i == n - 2) {
                    count++;
                }
                continue;
            } else {
                count++;
                if (i == n - 2) {
                    count++;
                }
            }


        }
        System.out.println(count);
    }
}
