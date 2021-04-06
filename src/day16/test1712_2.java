package day16;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-10 11:27
 */
public class test1712_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] = new int[1005];
        boolean flag[] = new boolean[1005];
        for (int i = 0; i < n; i++) {
            flag[i] = true;
        }
        int count=0;
        int sum = n;
        while (sum != 1) {
            for (int i = 0; i < n; i++) {

                if (flag[i]) {
                    count++;
                    if (count % k == 0 || count % 10 == k) {
                        flag[i] = false;
                        sum--;
                        if (sum == 1) {
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
