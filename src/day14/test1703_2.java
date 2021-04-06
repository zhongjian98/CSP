package day14;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-08 13:22
 */
public class test1703_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);
        }
        int point[] = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            point[i] = i - 1;
        }
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            int dis = scanner.nextInt();

            int temp = linkedList.remove(point[num]);

            linkedList.add(point[num]+dis,temp);

            int p = point[num];
            if (dis > 0) {
                for (int j = p; j < p + dis; j++) {
                    point[linkedList.get(j)]--;
                }
            } else {
                for (int j = p; j <p+dis ; j++) {
                    point[linkedList.get(j)]--;
                }
            }
            point[num] = p + dis;
        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");

        }
        scanner.close();





    }
}
