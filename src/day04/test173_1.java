package day04;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-16 19:00
 */
public class test173_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int sum=0;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= k) {
                sum=0;
                count++;
            }
        }
        if (sum > 0) {//细节
            count++;
        }
        System.out.println(count);
    }
}
