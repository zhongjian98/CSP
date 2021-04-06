package day02;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-12 20:20
 */
public class test1712_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int N=1000;
        int[] a = new int[N];
//        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//        }
        for (int i = 0, cout = 0; ; ) {
            if (n == 1) {
                break;
            }
            if (a[i] == 0) {
                cout++;
                if (cout % k == 0 || cout % 10 == k) {
                    n--;
                    a[i]=1;
                }
            }
            i=(i+1)%n;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
