package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-02 12:37
 */
public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();

        }
        int count=0;
        for (int i = 1; i < n-1; i++) {
            if (a[i] > a[i - 1] && a[i + 1] < a[i]) {
                count++;
            }
            if (a[i] < a[i + 1] && a[i - 1] > a[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
