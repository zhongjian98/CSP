package day13;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-05 11:48
 */
public class test1612_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = 0;
        if(t <= 3500)
            s = t;
        else if(t <= 4955)     // 3500 < s <= 5000
            s = (int)((t-3500)/0.97+3500);
        else if(t <= 7655)     // 5000 < s <= 8000
            s = (int)((t-4955)/0.9+5000);
        else if(t <= 11255)    // 8000 < s <= 12500
            s = (int)((t-7655)/0.8+8000);
        else if(t <= 30755)    // 12500 < s <= 38500
            s = (int)((t-11255)/0.75+12500);
        else if(t <= 44755)    // 38500 < s <= 58500
            s = (int)((t-30755)/0.7+38500);
        else if(t <= 61005)    // 58500 < s <= 83500
            s = (int)((t-44755)/0.65+58500);
        else                   // 83500 < s
            s = (int)((t-61005)/0.55+83500);

        System.out.println(s);
        sc.close();

    }
}
