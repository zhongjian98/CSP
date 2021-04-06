package day19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-04 11:47
 */
public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int[100];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                if (a[j] > a[j + 1]) {
                    int t=0;
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        
    }
}
