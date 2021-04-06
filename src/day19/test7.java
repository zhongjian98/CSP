package day19;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-02 12:27
 */
public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n=scanner.nextLine();
        char[] chars = n.toCharArray();
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            sum+=Integer.parseInt(String.valueOf(chars[i]));
        }
        System.out.println(sum);
    }

}
