package day16;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-10 16:20
 */
public class test1909_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[1005][1005];
        for (int i = 0; i < n; i++) {
            a[i][0] = scanner.nextInt();
        }
    }
}
