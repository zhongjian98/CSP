package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-03 14:04
 */
public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();

        }
        int min=Math.abs(a[0]-a[1]);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if (Math.abs(a[i] - a[j]) < min) {
                    min=Math.abs(a[i] - a[j ]);
                }
            }
        }
        System.out.println(min);
    }
}
