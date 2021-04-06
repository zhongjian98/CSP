package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-03 13:57
 */
public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=(n/50)*7+(n%50)/30*4+(n%50)%30/10;
        System.out.println(sum);
    }
}
