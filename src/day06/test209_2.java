package day06;

import java.util.Scanner;


public class test209_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int DL = 0;
        int JG = 0;


        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            boolean fl = false;
            boolean f2 = false;
            int count = 0;
            for (int j = 0; j < t; j++) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
                    fl = true;
                    count++;
                    if (count >= k) f2 = true;
                    }
                else count = 0;
                }

                if (f2) DL++;
                if (fl) JG++;

        }
        System.out.println(JG + "\n" + DL);
    }
}






