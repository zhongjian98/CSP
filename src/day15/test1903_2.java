package day15;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-09 16:29
 */
public class test1903_2 {
    public static int jisuan(int a, Character type, int b) {
        switch (type) {
            case 'x':
                return a * b;
            case '/':
                return a / b;
            case '+':
                return a + b;
            default:
                return a - b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result[] = new String[102];
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            int num[] = {Integer.valueOf(str.charAt(0)) - 48, Integer.valueOf(str.charAt(2)) - 48, Integer.valueOf(str.charAt(4)) - 48, Integer.valueOf(str.charAt(6)) - 48};
//              int num[] = {str.charAt(0),str.charAt(2), str.charAt(4), str.charAt(6)};

            int[] oper = {0, 0, 0};     // 运算符优先级 0代表+或-， 1代表x或/
            int index=0;
            for (int j = 1; j <= 5; j += 2, index++) {
                if (str.charAt(j) == 'x' || str.charAt(j) == '/') {
                    oper[index]=1;
                }
            }
            int flag = 0;
            int sum = 0;
            if (oper[0]==1) flag += 4;
            if (oper[1]==1) flag += 2;
            if (oper[2]==1) flag += 1;

            switch (flag) {
                case 1:// 0 0 1
                case 5:// 1 0 1
                    sum = jisuan(jisuan(num[0], str.charAt(1), num[1]), str.charAt(3), jisuan(num[2], str.charAt(5), num[3]));
                    break;
                case 2:// 0 1 0
                case 3:// 0 1 1:
                    sum = jisuan(num[0], str.charAt(1), jisuan(jisuan(num[1], str.charAt(3), num[2]), str.charAt(5), num[3]));
                    break;
                default:// 111 000 100 110
                    sum = jisuan(jisuan(jisuan(num[0], str.charAt(1), num[1]), str.charAt(3), num[2]), str.charAt(5), num[3]);
            }

            result[i] = (sum == 24) ? "Yes" : "No";

        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}



