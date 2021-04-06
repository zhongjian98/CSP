package day19;


import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-02 11:47
 */
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[1005][1005];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
