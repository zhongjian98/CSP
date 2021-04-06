package day15;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-09 19:09
 */
public class test1803_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int t = scanner.nextInt();
        int a[] = new int[105];
        int b[] = new int[105];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = 1;
            if (a[i] == l) {
                b[i] = -1;
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                a[j] += b[j];
                if (a[j] == l || a[j] == 0) {
                    b[j] = -b[j];
                }
            }
            for (int j = 0; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[j] == a[k]) {
                        b[j] = -b[j];
                        b[k] = -b[k];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
