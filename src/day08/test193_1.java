package day08;


import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-30 10:10
 */
public class test193_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[100000];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = 0, min = 0;
        double  mid=0;
        if (n % 2 != 0) {
            if (arr[0] > arr[n - 1]) {
                max = arr[0];
                min = arr[n - 1];
                mid = (int)arr[n / 2];

            } else {
                min = arr[0];
                max = arr[n - 1];
                mid = (int)arr[n / 2];
            }
        } else {
            if (arr[0] > arr[n - 1]) {
                max = arr[0];
                min = arr[n - 1];
                mid =  (double) (arr[n / 2]+arr[n/2-1])/2*1.0;

            } else {
                min = arr[0];
                max = arr[n - 1];
                mid =  (double) (arr[n / 2]+arr[n/2-1])/2*1.0;
            }
        }

        if(mid*2%2==0)
            System.out.printf("%d %.0f %d",max,mid,min);
        else
            System.out.printf("%d %.1f %d",max,mid,min);

    }
}
