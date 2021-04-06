package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 17:06
 */
public class test1712_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        boolean flag[] = new boolean[1005];
        for (int i = 0; i < n; i++) {
            flag[i] = true;
        }
        int count = 0;
        int temn=n;

        while (temn != 1) {
            for (int i = 0; i < n; i++) {

                if (flag[i]) {
                    count++;
                    if (count % k == 0 || count % 10 == k) {
                        flag[i] = false;
                        temn--;
                        if (temn == 1) {
                            break;
                        }
                    }

                }

            }
        }

        for (int i = 0; i < n; i++) {
            if (flag[i]) {
                System.out.println(i+1);
            }
        }
    }
}

