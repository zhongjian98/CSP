package day06;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-27 10:15
 */
public class test209_1 {
    public static void main(String[] args) {
        int arr[][] = new int[205][2];


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        double []b = new double[205];

        for (int i = 1; i <= n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();

        }
        for (int i = 1; i <= n; i++) {
            b[i] = Math.sqrt((X - arr[i][0]) * (X - arr[i][0])+ (Y - arr[i][1])*(Y - arr[i][1]));
        }

        int  c[] = new int[205];
        for (int i = 1; i <= n; i++) {
            c[i] = i;
        }

        for (int i = 1; i <=n-1; i++) {
            for (int j = 1; j <=n-1-i ; j++) {
                if (b[j] > b[j + 1]) {

                    int temp = c[j];
                    c[j]=c[j+1];
                    c[j + 1] = temp;

                    double temp1 = b[j];
                    b[j]=b[j+1];
                    b[j + 1] = temp1;
                }
            }

        }

        for (int i = 1; i <=3; i++) {
            System.out.println(c[i]);
        }

    }
}
