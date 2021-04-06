package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 20:57
 */
public class test2006_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int arr[][] = new int[a][2];
        for (int i = 0; i < a; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        long sum=0;
        int index=0;
        for (int i = 0; i < b; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (index < a && arr[index][0] == x) {
                sum += arr[index][1] * y;
            } else {
                while (index < a && arr[index][0] < x) {
                    index++;
                    if (index < a && arr[index][0] == x) {
                        sum += arr[index][1] * y;
                    }
                }
            }

        }
        System.out.println(sum);
    }
}
