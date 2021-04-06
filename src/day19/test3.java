package day19;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-01 20:54
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer a[] = new Integer[1005];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        Arrays.sort(a,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(a));

//        for (int i = 0; i < n-1; i++) {
//            if (Math.abs(a[i] - a[i + 1]) == 1) {
//                count++;
//            }
//        }
//        System.out.println(count);
        
    }
}
