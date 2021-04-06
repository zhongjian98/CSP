package day11;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-03 16:35
 */
public class test1409_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[105][5];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int flag[][] = new int[105][105];
        for (int i = 1; i <= n; i++) {
            for (int j = a[i][1]; j <a[i][3] ; j++) {
                for (int k = a[i][2]; k <a[i][4] ; k++) {
                    flag[j][k] = 1;
                }
            }
        }

        int count=0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (flag[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);



    }
}
