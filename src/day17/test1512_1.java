package day17;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-11 13:39
 */
public class test1512_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char ch[] = n.toCharArray();
        int sum=0;
        for (int i = 0; i < ch.length; i++) {
            sum += Integer.parseInt(String.valueOf(ch[i]));
        }
        System.out.println(sum);


//        for (int i = 0; i <n.length() ; i++) {
//
//
//        }
    }
}
