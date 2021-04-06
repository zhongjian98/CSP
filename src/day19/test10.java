package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-02 13:26
 */
public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] = new int[1005];
        int sum=0;
        int count=0;

        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();

        }
        for (int i = 0; i < n ; i++) {
            sum=sum+a[i];
            if (sum >= k) {
                count++;
                sum=0;
                continue;
            }
            if (i == n - 1) {
                count++;
            }
        }
        System.out.println(count);

    }
}
