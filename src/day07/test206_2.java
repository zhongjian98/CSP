package day07;

import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-29 11:32
 */
public class test206_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            map.put(x, y);

        }

        long sum=0L;

        for (int i = 0; i < b ; i++) {
            int index = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.containsKey(index)) {
                sum += value * map.get(index);
            }
        }
        System.out.println(sum);
    }


}

