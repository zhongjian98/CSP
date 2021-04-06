package day01;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-11 18:44
 */
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] a=new int[n][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int sum=0;
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 2) {
                sum += a[i][1] + r;
            } else if (a[i][0] == 3) {
                sum += 0;
            } else {
                sum += a[i][1];
            }
        }
        System.out.println(sum);

        }
    }

