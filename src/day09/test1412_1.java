package day09;


import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-01 13:12
 */
public class test1412_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1005];
        int count[] = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            count[i]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && a[i] == a[j]) {
                    count[j] = count[i] + 1;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(count[i]+" ");
        }

    }
}
