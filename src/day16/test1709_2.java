package day16;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-10 11:59
 */
public class test1709_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = (n / 50) * 7 + (n % 50) / 30 * 4 + (n % 50) % 30 / 10;
        System.out.println(sum);
    }
}
