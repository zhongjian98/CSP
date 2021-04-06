package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 13:49
 */
public class test1604_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int cout=0;
        for (int i = 1; i < n-1; i++) {
            if (a[i - 1] > a[i] && a[i + 1] > a[i] || a[i - 1] < a[i] && a[i + 1] < a[i]) {
                cout++;
            }
        }
        System.out.println(cout);
    }
}
