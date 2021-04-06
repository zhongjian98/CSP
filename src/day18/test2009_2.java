package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 20:17
 */
public class test2009_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int count=0;

        int dl=0;
        int jg=0;
        boolean flag1 = false;
        boolean flag2=false;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < t; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (x1 <= x && x <= x2 && y1 <= y && y <= y2) {
                    flag1 = true;
                    count++;
                    if (count >= k) {
                        flag2 = true;
                    }
                } else {
                    count=0;
                }
            }
            if (flag1) {
                jg++;
                flag1 = false;
            }
            if (flag2) {
                dl++;
                flag2 = false;
            }

            count=0;

        }
        System.out.println(jg);
        System.out.println(dl);
    }
}
