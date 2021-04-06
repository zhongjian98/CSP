package day11;


import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-03 12:03
 */
public class test1403_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[11][5];
        int b[][] = new int[11][3];
        int c[] = new int[4];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 5; j++) {
                a[i][j] = scanner.nextInt();
            }
            c[i] = n-i+1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j < 3; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        String[] strings = new String[11];
        int t=0;
        boolean flag = false;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= n; j++) {
                if (b[i][1] >= a[c[j]][1] && b[i][1] <= a[c[j]][3] && b[i][2] >= a[c[j]][2] && b[i][2] <= a[c[j]][4]) {

                    t=j;
                    flag = true;
                }
                if (flag) {
                    strings[i] = "" + c[j] + "";
                    int temp = 0;
                    for (int k = t; k > 1; k--) {
                        temp = c[k];
                        c[k] = c[k - 1];
                        c[k - 1] = temp;
                    }
                    flag = false;
                    break;
                } else {
                    strings[i] = "IGNORED" ;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            System.out.println(strings[i]);
        }
    }
}
