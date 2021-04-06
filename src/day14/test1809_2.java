package day14;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-08 18:40
 */
public class test1809_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[1000005];
        for (int i = 0; i < n * 2; i++) {
            int start = scanner.nextInt();//定义开始和结束  所有数组开辟的空间为时间段的限制范围1000000
            int end = scanner.nextInt();//而不是单存的n的限制大小
            for (int j = start; j < end; j++) {
                a[j]++;
            }
        }
        int res=0;
        for (int i = 0; i < 1000005; i++) {
            if (a[i] == 2) {
                res++;
            }
        }
        System.out.println(res);

    }

}
//比较两个时间段重复的时间    1、开始时间卡在a~b中间    2、结束时间在a~b中间   3、开始和结束时间都在a~b中间

