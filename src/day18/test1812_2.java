package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 16:13
 */
public class test1812_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        long sum=0;//
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int t = scanner.nextInt();
            if (k == 0) {
                sum += t;
            } else {
                long curtime=0;
                if (k == 1) {
                    curtime = (r - t + sum) % (r + g + y);
                }
                if (k == 2) {
                    curtime = (r + g + y - t + sum) % (r + g + y);
                }
                if (k == 3) {
                    curtime = (r + g - t + sum) % (g + r + y);
                }
                if (curtime <= r) {
                    sum+=r-curtime;
                }
                if (curtime < g + r + y && curtime >= g + r) {
                    sum += r + r + g + y - curtime;
                }
            }
        }
        System.out.println(sum);
    }
}
