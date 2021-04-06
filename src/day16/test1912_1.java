package day16;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-10 13:43
 */
public class test1912_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        int index=0;
        int cout[] = new int[5];
        while (count != n) {
            index++;
            if (String.valueOf(index).contains("7")||index%7==0) {
                cout[index % 4]++;
            } else {
                count++;
            }
        }
        for (int i = 1; i <4; i++) {
            System.out.println(cout[i]);
        }
        System.out.println(cout[0]);
    }
}
