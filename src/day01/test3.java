package day01;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-11 17:09
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int max,min;
        double mid;
        if (a[n - 1] > a[0]) {
            max = a[n - 1];
            min = a[0];

        }else {
            max=a[0];
            min = a[n - 1];

        }
        if (n % 2 != 0) {
            mid = a[(n - 1) / 2];
            System.out.print(max + " " + (int) mid + " " + min);
        } else {
            double sum=0;
            sum = a[n / 2] + a[n / 2 - 1];
            mid=  sum/2;
            if ((mid - (int) mid) == 0) {
                System.out.println(max + " " + (int) mid + " " + min);
            } else {
                System.out.println(max + " " + (int) mid + " " + min);
            }
        }
    }
}
