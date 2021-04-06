package day09;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-01 10:23
 */
public class test1312_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        int count[] = new int[1005];
        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count[i]++;
                }
            }
        }
        int maxcount = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > maxcount) {
                maxcount = count[i];
                temp = i;
            }
        }
        int min = a[temp];
        for (int i = 0; i < n; i++) {
            if (count[i] == maxcount) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        System.out.println(min);
    }
}
