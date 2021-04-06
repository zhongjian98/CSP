package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 16:22
 */
public class test1812_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        int sum=0;

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int t = scanner.nextInt();
            if (k == 0 || k == 1) {
                sum += t;
            }
            if (k == 2) {
                sum += t + r;
            }
        }
        System.out.println(sum);
    }
}
