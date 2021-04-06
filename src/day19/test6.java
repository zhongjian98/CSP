package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-02 12:07
 */
public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n-1; i++) {
            if (i != n - 2) {
                if (a[i] == a[i + 1]) {
                    continue;
                } else {
                    count++;
                }
            } else {
                if (a[i] == a[i + 1]) {
                    count++;
                } else {
                    count=count+2;
                }
            }

        }
        System.out.println(count);
    }
}
