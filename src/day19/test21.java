package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-05 18:18
 */
public class test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a[][] = new int[205][2];
        double b[]=new double[205];
        int index[] = new int[205];
        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            b[i]=  Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
            index[i]=i+1;
        }
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < n - i; j++) {
                if (b[j] > b[j + 1]) {
                    double tem=0;
                    tem = b[j];
                    b[j] = b[j + 1];
                    b[j+1]=tem;
                    int in=0;
                    in=index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = in;

                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(index[i]);
        }
    }
}
