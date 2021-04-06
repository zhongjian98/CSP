package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-05 18:51
 */
public class test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean f1 = false;
        boolean f2=false;
        int cout=0;
        int lg=0;
        int dl=0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (x1 <= x && x <=x2 && y1 <= y && y <= y2) {
                    f1 = true;
                    cout++;
                    if (cout >= k) {
                        f2 = true;
                    }

                } else {
                    cout=0;
                }
            }
            if (f1) {
                lg++;
                f1=false;
            }
            if (f2) {
                dl++;
                f2 = false;
            }
            cout=0;
        }
        System.out.println(lg);
        System.out.println(dl);

    }
}
