package day15;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-09 13:46
 */

// 将红绿灯每种灯亮划分区间，在[0,r]区间内红灯亮，在(r,g+r]区间内绿灯亮，在(r+g,r+g+y]区间内黄灯亮，在划分好区间后只需要判断当小明到达红绿灯时是哪个灯在亮，就可以判断出通过红绿灯的时间
public class test1812_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int t = scanner.nextInt();
            if (k == 0) {
                sum += t;
            } else {
                long tmp=0;
                if (k == 1) {
                    tmp = (sum + r - t) % (r + g + y);
                }
                if (k == 2) {
                    tmp = (sum + r + g + y - t) % (r + g + y);
                }
                if (k == 3) {
                    tmp = (sum + r + g - t) % (r + g + y);
                }

                if (tmp < r) {
                    sum += r - tmp;
                }
                if (r + g <= tmp && tmp < r + g + y) {
                    sum += r + g + y - tmp + r;
                }
            }
        }
        System.out.println(sum);
    }
}
