package day05;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-17 16:57
 */
public class lianxi {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//            case 3:
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("end");
//        }
//    }
//        int x=0;
//        int y=0;
//        int k=0;
//        for (int z = 0; z < 5; z++) {
//            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
//                x++;
//                ++y;
//                k++;
//            }
//        }
//        System.out.println(x+" "+y+" "+k);
//        }
//        char c = 040;
        try {
            test(new int[]{0, 1, 2, 3, 4, 5});
        } catch (Exception e) {
            System.out.println("E");
        }
    }

    public static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.println(i);

                }
            }finally {
                System.out.println("e");
            }
        }
    }
    @Test
    public void test2() {
        byte a1=2,a2=4,a3;
        short s=16;
     float []f[]=new float[6][];
     
    }
}


