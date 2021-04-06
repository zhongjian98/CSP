package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 18:54
 */
public class test2006_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[1005][2];
        String type[] = new String[1005];
        int A=0,B=0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = scanner.nextInt();
            }
            type[i] = scanner.next();
            if (type[i].equals("A")) {
                A++;
            }
            if (type[i].equals("B")) {
                B++;
            }
        }
        int c1=0,c2=0;
        for (int i = 0; i < m; i++) {
            int z = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                if ("A".equals(type[j])&&a[j][0] * x + a[j][1] * y + z < 0) {
                    c1++;
                }
                if ("B".equals(type[j])&&a[j][0] * x + a[j][1] * y + z > 0) {
                    c2++;
                }
            }
            if (A == c1 && B == c2 || c1 == 0 && c2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            c1=0;
            c2=0;
        }
    }
}
