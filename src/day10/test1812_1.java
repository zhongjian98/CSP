package day10;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-02 16:16
 */
public class test1812_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum=0;
        int count=1;
        for (int i = 0; i <11 ; i++) {
            if (i == 1 || i == 5) {
                continue;
            }
            sum += Integer.parseInt(String.valueOf(str.charAt(i))) * count;
            count++;
        }
        int result=sum%11;
        StringBuilder str1 = new StringBuilder();
        if (result == 10 && str.charAt(12) == 'X') {
            System.out.println("Right");
            return;
        }
        if (result == Integer.parseInt(String.valueOf(str.charAt(12)))) {
            System.out.println("Right");
        } else {
            for (int i = 0; i < 12; i++) {
                str1.append(str.charAt(i));
            }
            if (result == 10) {
                str1.append("X");
            } else {
                str1.append(result);
            }

            System.out.println(str1);
        }

    }
}

//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.next();
//        char[] arr = string.toCharArray();
//
//        //计算最后一位的值
//        int sum = 0;
//        int j = 1;
//        for (int i = 0; i < arr.length-2; i++) {
//            if(i==1||i==5){
//                continue;
//            }else{
//                sum += (((int)arr[i]-48)*j);
//                j++;
//            }
//        }
//        sum = sum % 11;
//        if( sum == 10 && arr[12] == 'X'){
//            System.out.println("Right");
//            return;
//        }
//        if(sum == (int)arr[12]-48){
//            System.out.println("Right");
//        } else {
//            if(sum == 10){
//                arr[12] = 'X';
//            }else{
//                arr[12] = (char)(sum+48);
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]);
//            }
//        }
//
//    }
//}

