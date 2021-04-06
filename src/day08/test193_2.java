package day08;
import  java.util.Scanner;
/**
 * @author zhongyanzu
 * @create 2020-11-30 11:33
 */
public class test193_2 {

    public static int cul(int num1, Character type, int num2) {
        switch (type) {
            case 'x':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '+':
                return num1 + num2;
            default:
                return num1 - num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] output = new String[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int[] num = {Integer.valueOf(str.charAt(0)) - 48, Integer.valueOf(str.charAt(2)) - 48,
                    Integer.valueOf(str.charAt(4)) - 48, Integer.valueOf(str.charAt(6)) - 48};

            int[] oper = {0, 0, 0};     // 运算符优先级 0代表+或-， 1代表x或/
            int index = 0;
            for (int j = 1; j <= 5; j += 2, index++)
                if (str.charAt(j) == 'x' || str.charAt(j) == '/')
                    oper[index] = 1;
            int oper_res = 0;
            if (oper[0] == 1) oper_res += 4;
            if (oper[1] == 1) oper_res += 2;
            if (oper[2] == 1) oper_res += 1;

            int res = 0;
            switch (oper_res) {
                case 1:     // 两边运算符优先 0 0 1
                case 5:     //             1 0 1
                    res = cul(cul(num[0], str.charAt(1), num[1]), str.charAt(3), cul(num[2], str.charAt(5), num[3]));
                    break;
                case 2:     // 中间运算符优先 0 1 0
                case 3:     // 后边运算符优先 0 1 1
                    int mid = cul(num[1], str.charAt(3), num[2]);
                    int right = cul(mid, str.charAt(5), num[3]);
                    res = cul(num[0], str.charAt(1), right);
                    break;
                default:    // 按顺序 0 0 0 , 1 0 0 , 1 1 0 , 1 1 1
                    res = cul(num[0], str.charAt(1), num[1]);
                    res = cul(res, str.charAt(3), num[2]);
                    res = cul(res, str.charAt(5), num[3]);
            }

            output[i] = (res == 24) ? "Yes" : "No";
        }
        for (int i = 0; i < n; i++)
            System.out.println(output[i]);
    }
}


