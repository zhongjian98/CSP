package day16;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-10 13:18
 */
public class test1909_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[1005][1005];
        int sum=0;
        int max=0;
        int count=0;
        int temp=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m + 1; j++) {
                a[i][j] = scanner.nextInt();
                sum += a[i][j];
            }
            for (int j = 2; j <= m + 1; j++) {
                count += Math.abs(a[i][j]);
            }
            if (max <count) {
                max=count;
                temp = i;
            }
            count=0;
        }
        System.out.print(sum+" "+temp+" "+max);
    }
}
