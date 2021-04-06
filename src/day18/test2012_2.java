package day18;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2021-04-01 15:29
 */
public class test2012_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[][] a = new int[m][2];
        for (int i = 0; i < m; i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }
        int maxindex=0;
        int countmax=0;

        for (int i = 0; i < m; i++) {
            int count=0;
            for (int j = 0; j < m; j++) {
                if (a[j][0] < a[i][0] && a[j][1] == 0) {
                        count++;
                        continue;
                }
                if (a[j][0] >= a[i][0] && a[j][1] == 1) {
                        count++;
                        continue;
                }
            }
            if (count > countmax) {
                maxindex=a[i][0];
                countmax=count;
            }
            if (count == countmax && a[i][0] > maxindex) {
                maxindex=a[i][0];
            }


        }
        System.out.println(maxindex);
//        System.out.println(countmax);
    }
}
