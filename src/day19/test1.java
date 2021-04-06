package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-01 16:55
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[10005];
        for (int i = 0; i < n; i++) {
            a[scanner.nextInt()]++;
        }
        int maxcount=0;
        int index=0;
        for (int i = 0; i < 10001; i++) {
            if (a[i] > maxcount) {
                maxcount=a[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
