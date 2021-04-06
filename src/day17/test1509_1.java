package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 13:22
 */
public class test1509_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                if (i == n - 2) {//注意最后的数列都相同时也要累计一次
                    count++;
                }
                continue;

            } else {
                count++;
                if (i == n - 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
