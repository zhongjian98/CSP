package day04;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-16 19:58
 */
public class test17_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=1005;
        int[] b = new int[N];
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int flag=0;
        for (int i = 0; i <n; i++) {
            b[i] = i+1;
        }
        int[][]arr=new int[N][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <m; i++) {
            if (arr[i][1] > 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][0] == b[j]) {
                        flag=j;
                        break;
                    }
                }
                for (int j = flag ; j < flag + arr[i][1]; j++) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
            if (arr[i][1] < 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][0] == b[j]) {
                        flag=j;
                        break;
                    }
                }
                for (int j = flag; j > flag + arr[i][1]; j--) {
                    int temp = b[j];
                    b[j] = b[j -1];
                    b[j - 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print (b[i]+" ");
        }

    }
}
