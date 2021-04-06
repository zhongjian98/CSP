package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 19:47
 */
public class test1509_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int d = scanner.nextInt();
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            month[1]=29;
        }
        int temp=0;
        for (int i = 0; i < 12; i++) {
            if (d - month[i] > 0) {
                d = d - month[i];
                temp = i + 2;
            } else {
                temp = i + 1;
                break;
            }
        }
        System.out.println(temp);
        System.out.println(d);
    }
}
