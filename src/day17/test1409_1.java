package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 12:17
 */
public class test1409_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int cout=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == 1) {
                    cout++;
                }
            }
        }
        System.out.println(cout);

    }
}
