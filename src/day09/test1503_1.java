package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-01 14:04
 */
public class test1503_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[1005][];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");

            }
            System.out.println();
        }
    }
}
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        // TODO Auto-generated method stub
//        Scanner sc=new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;String[] temp;
//
//        str = br.readLine();
//        temp = str.split(" ");
//        int n = Integer.parseInt(temp[0]);
//        int m = Integer.parseInt(temp[1]);
//
//        int a[][]=new int[1001][1001];
//        for(int i=0;i<n;i++) {
//            str = br.readLine();
//
//            temp = str.split(" ");
//            for(int j=0;j<temp.length;j++) {
//
//                a[i][j]= Integer.parseInt(temp[j]);
//
//            }
//        }
//
//        for(int i=m-1;i>=0;i--) {
//            for(int j=0;j<n;j++) {
//                System.out.print(a[j][i]);
//                if(j!=n-1) System.out.print(" ");
//                else System.out.println();
//            }
//
//
//        }
//    }
//}


