package day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 12:47
 */
public class test1503_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.valueOf(s[0]);
        int m = Integer.valueOf(s[1]);
        int a[][] = new int[1005][1005];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(str[j]);
            }
        }
        for (int i = m-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
}
