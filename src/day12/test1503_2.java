package day12;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-04 12:38
 */
public class test1503_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];


        for (int i = 0; i < n; i++) {
            a[scanner.nextInt()] += 1;
        }

        int[] index = new int[n + 1];
        int[] max = new int[n + 1];

        for (int i = 0; i < n; i++) {
            max[i] = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > 0) {
                    if (max[i] < a[j]) {
                        max[i] = a[j];
                        index[i] = j;
                    }
                }
            }
            a[index[i]] = 0;
            if (max[i] != 0) {
                System.out.println(index[i] + " " + max[i]);
            }


        }
    }
}