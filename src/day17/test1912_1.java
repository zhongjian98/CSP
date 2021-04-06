package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 18:22
 */
public class test1912_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[4];
        int count=0;
        int index=0;
        while (count != n) {
            index++;
            if (index % 7 == 0 || String.valueOf(index).contains("7")) {
                a[index % 4]++;
                continue;
            }
            count++;
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println(a[i]);
        }
        System.out.println(a[0]);

    }
}
