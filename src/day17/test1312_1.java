package day17;


import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 11:42
 */
public class test1312_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[10005];
        int count=0;
        int max=0;
        while (n != 0) {
            a[scanner.nextInt()]++;
            n--;
        }
        for (int i = 1; i < 10001; i++) {
            if (a[i] > max) {
                max=a[i];
                count = i;
            }
        }
        System.out.println(count);

    }

}
