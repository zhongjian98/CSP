package day18;

import sun.awt.geom.PathConsumer2D;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 14:12
 */
public class test1903_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result[] = new String[105];
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            int num[] = {Integer.valueOf(str.charAt(0))-48, Integer.valueOf(str.charAt(2))-48, Integer.valueOf(str.charAt(4))-48, Integer.valueOf(str.charAt(6))-48};
            int op[] = {0, 0, 0};
            int index=0;
            for (int j = 1; j <=5 ; j+=2,index++) {
                if (str.charAt(j) == 'x' || str.charAt(j) == '/') {
                    op[index] = 1;
                }
            }
            int res=0;
            if (op[0]==1) res += 4;
            if (op[1]==1) res += 2;
            if (op[2]==1) res += 1;
            int sum=0;
            switch (res) {
                case 1://0 0 1
                case 5://1 0 1
                    sum = cul(cul(num[0], str.charAt(1), num[1]), str.charAt(3), cul(num[2], str.charAt(5), num[3]));
                    break;
                case 2://0 1 0
                case 3://0 1 1
                    sum = cul(num[0], str.charAt(1), cul(cul(num[1], str.charAt(3), num[2]), str.charAt(5), num[3]));
                    break;
                default:
                    sum = cul(cul(cul(num[0], str.charAt(1), num[1]), str.charAt(3), num[2]), str.charAt(5), num[3]);
            }
            if (sum == 24) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
            System.out.println(result[i]);

        }
    }


    public static int cul(int x, Character type, int y) {
        switch (type) {
            case 'x':
                return x * y;
            case '/':
                return x / y;
            case '+':
                return x + y;
            default:
                return x - y;

        }
    }


}
