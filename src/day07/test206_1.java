package day07;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-29 10:35
 */
public class test206_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[1005][2];
        String[] s = new String[1005];
        String[] result = new String[25];
        int c1=0,c2=0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            String type = scanner.next();

            a[i][0] = x;
            a[i][1] = y;
            s[i] = type;
            if ("A".equals(type)) {
                c1++;
            }
            if ("B".equals(type)) {
                c2++;
            }
        }

        int count1 = 0, count2 = 0;
        for (int i = 0; i < m; i++) {
            int z = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                if ("A".equals(s[j]) && (a[j][0] * x1 + a[j][1] * y1 + z) > 0) {
                    count1++;
                }
                if ("B".equals(s[j]) && (a[j][0] * x1 + a[j][1] * y1 + z) < 0) {
                    count2++;
                }
             }
            if ((count1 == c1 && count2 == c2) || (count1 == 0 && count2 == 0)) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
            count1=0;
            count2 = 0;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(result[i]);
        }

    }
}
