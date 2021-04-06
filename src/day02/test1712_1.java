package day02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.sort;

/**
 * @author zhongyanzu
 * @create 2020-11-12 19:57
 */
public class test1712_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }
        int min=10005;

        for (int i = 1; i < a.length; i++) {
            if ((a[i ] - a[i-1]) < min) {
                min=a[i] - a[i-1];
            }
        }
        System.out.println(min);

    }
}
