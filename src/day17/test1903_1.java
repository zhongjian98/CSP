package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 16:29
 */
public class test1903_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[100000];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max=0,min=0;


        if (a[0] > a[n - 1]) {
            max = a[0];
            min = a[n - 1];
        } else {
            min = a[0];
            max = a[n - 1];
        }

        if (n % 2 != 0) {

            System.out.println(max + " " +  a[n / 2] + " " + min);
        } else {
            if ((a[n / 2] + a[n / 2 - 1]) % 2 == 0) {

                System.out.println(max + " " + (a[n / 2] + a[n / 2 - 1]) / 2 + " " + min);
            } else {

                 System.out.println(max + " " + ((a[n / 2] + a[n / 2 - 1]) / 2.0) + " " + min);
            }
        }

    }
}
