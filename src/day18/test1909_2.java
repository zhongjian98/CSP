package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 11:35
 */
public class test1909_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        int a[][] = new int[1005][1005];


        for (int i = 0; i < n; i++) {
            a[i][0] = scanner.nextInt();
            for (int j = 1; j <= a[i][0]; j++) {
                a[i][j] = scanner.nextInt();

            }
        }
        int t=0,d=0,e=0;
        for (int i = 0; i < n; i++) {
            for (int j = a[i][0]; j >0 ; j--) {
                t += a[i][j];
                if (a[i][j] > 0) {
                    break;
                }
            }
        }
        int count[] = new int[1005];

        for (int i = 0; i < n; i++) {
            boolean flag = false, flag1 = false;
            int sum1=a[i][1],sum2=0;
            for (int j = 2; j <=a[i][0] ; j++) {
                if (a[i][j] > 0) {
                    flag = true;
                }
                if (flag) {
                    sum2 = a[i][j];
                    flag1 = true;
                    break;

                } else {
                    sum1 += a[i][j];
                }
            }
            if (sum1 != sum2&&flag1) {
                d++;
                count[i] = 1;
            }

        }
        for (int i = 0; i < n; i++) {
            if (count[i%n] == 1 && count[(i + 1) % n] == 1 && count[(i + 2) % n] == 1) {
                e++;
            }
        }
        System.out.println(t+" "+d+" "+e);
    }
}
