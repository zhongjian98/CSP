package day12;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-04 14:14
 */
public class test1509_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int d = scanner.nextInt();
        int month[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) {
            month[2]++;
        }
        for (int i = 1; i <= 12; i++) {

            if (d > month[i]) {
                d -= month[i];
            } else {
                System.out.println(i);
                System.out.println(d);
                break;
            }
        }

    }
}
