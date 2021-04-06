package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-01 17:45
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[505];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == -a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
