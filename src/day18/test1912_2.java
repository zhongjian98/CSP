package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 10:04
 */
public class test1912_2 {
    //无法开辟10~9的数组空间   采用n作为数组  录入数据  定义方法判断该点周围是否存在垃圾  返回1
    public static  int index[][] = new int[1005][2];
    public static int findRubbish(int x, int y, int n) {
        for (int i = 0; i < n; i++) {
            if (index[i][0] == x && index[i][1] == y) {
                return 1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result[] = new int[5];


        for (int i = 0; i < n; i++) {
            index[i][0] = scanner.nextInt();
            index[i][1] = scanner.nextInt();

        }
        for (int i = 0; i < n; i++) {
            int x = index[i][0];
            int y = index[i][1];
            if (findRubbish(x - 1, y, n) == 1 && findRubbish(x + 1, y, n) == 1 && findRubbish(x, y + 1, n) == 1 && findRubbish(x, y - 1, n) == 1) {
                int cout=0;
                if (findRubbish(x - 1, y - 1, n)==1)cout++;
                if(findRubbish(x - 1, y + 1, n)==1)cout++;
                if(findRubbish(x + 1, y - 1, n)==1)cout++;
                if(findRubbish(x + 1, y + 1, n)==1)cout++;
                result[cout]++;
            }

        }


        for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }

    }
}
