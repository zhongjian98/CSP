package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 12:24
 */
public class test1412_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        int b[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[a[i]]++;
            System.out.print(b[a[i]]+" ");

        }

//        for (int i = 0; i < n-1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] == a[j]) {
//                    b[j] = b[i]+1;
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(b[i]+" ");
//        }


    }
}
