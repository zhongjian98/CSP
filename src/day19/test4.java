package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-01 21:14
 */
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        int b[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[a[i]]++;
            System.out.print(b[a[i]]+" ");

        }
    }
}
