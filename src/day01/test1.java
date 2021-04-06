package day01;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-11 16:02
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[4];
        int counter=0;
        int i=0;
        while (counter != n) {
            i++;
            if (i % 7 == 0 || Integer.toString(i).contains("7")) {
                int b = i % 4;
                l[b]++;
            } else {
                counter++;
            }
        }
            System.out.println(l[1]);
            System.out.println(l[2]);
            System.out.println(l[3]);
            System.out.println(l[0]);

    }
}
