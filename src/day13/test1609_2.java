package day13;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-05 10:21
 */
public class test1609_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int[20];   // 每排还有几个空座位
        for(int i = 0;i < 20;i++)
            line[i] = 5;

        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int peo = sc.nextInt();
            boolean flag = false;      // 标记是否能分配到一排

            for(int j = 0;j < 20;j++){
                if(peo <= line[j]){    // 有一排的
                    flag = true;
                    for(int k = 0;k < peo;k++){
                        System.out.print((5*j+6-line[j]) + " ");
                        line[j]--;
                    }
                    System.out.println();
                    break;
                }
            }
//            另一种情况就是所有排座位都不满足要求 就要从头开始输出，更新座位剩余
            if(!flag){       // 没有分配到一排
                for(int j = 0;j < 20;j++){
                    while(line[j] > 0 && peo > 0){    // 该排有位置并且有人需要分配
                        System.out.print((5*j+6-line[j]) + " ");
                        line[j]--;
                        peo--;
                    }
                }
                System.out.println();
            }

        }
        sc.close();


    }
}
