package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 15:31
 */
public class test1809_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1000000];
        for (int i = 0; i < 2 * n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            for (int j = start; j < end; j++) {
                a[j]++;
            }
        }
        int cout=0;
        for (int i = 0; i < 1000000; i++) {
            if (a[i] == 2) {
                cout++;
            }
        }
        System.out.println(cout);
    }
}
