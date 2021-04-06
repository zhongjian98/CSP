package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 15:03
 */
public class test1703_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] = new int[1005];
        int cout=0;
        int sum=0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum >= k) {
                cout++;
                sum=0;
            }

        }
        if (sum > 0) {
            cout++;
        }
        System.out.println(cout);
    }
}
