package day14;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-08 16:06
 */
public class test1712_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        boolean[] flag = new boolean[1005];
        int a[] = new int[1005];
        for (int i = 1; i <= n; i++) {
            a[i] = i;
            flag[i] = true;
        }
        int count=n;
        int num=0;
        while (count != 1) {
            for (int i = 1; i <=n ; i++) {
                if (flag[i]) {
                    num++;
                    if (num % k == 0 || num % 10 == k) {
                        flag[i] = false;
                        count--;
                        if (count == 1) {
                            break;
                        }
                    }
                }

            }
        }
        for (int i = 1; i <= n; i++) {
            if (flag[i]) {
                System.out.println(a[i]);
            }
        }

    }
}
