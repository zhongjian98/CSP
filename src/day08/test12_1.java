package day08;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-30 12:01
 */
public class test12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int zhong=-1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            int count1=0,count2=0;
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    count1++;
                }
                if (a[i] < a[j]) {
                    count2++;
                }
            }
            if (count1 == count2) {
                temp = a[i];
                if (temp > zhong) {
                    zhong = temp;
                }
            }
        }
        System.out.println(zhong);
    }
}
