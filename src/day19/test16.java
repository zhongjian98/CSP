package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-04 12:59
 */
public class test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[1005][1005];
        int t=0;
        int d=0;
        int e=0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
            for (int j = m-1; j >0 ; j--) {
                t+=a[i][j];
                if (a[i][j] > 0) {

                    break;
                }
            }
            for (int j = 1; j < m; j++) {
                int temp=a[i][0];
                if (a[i][j] <= 0) {
                    temp+=a[i][j];
                    continue;
                }
                if (a[i][j]>0&&temp != a[i][j]) {
                    d++;
                }

            }
        }
        System.out.println(t+" "+d+" "+e);

    }
}
