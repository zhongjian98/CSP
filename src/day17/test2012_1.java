package day17;


import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-01 15:10
 */
public class test2012_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum=0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            sum+=x*y;
        }
        if (sum > 0) {
            System.out.println(sum);
        } else {

            System.out.println(0);
        }
    }
}
