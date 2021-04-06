package day11;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-03 20:45
 */
public class test1412_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//矩阵的大小
        int[][] matrix = new int[n][n];//存储矩阵

        for (int y = 0; y < n; y++)
            for (int x = 0; x < n; x++) {
                matrix[y][x] = sc.nextInt();
            }

        int x = 0, y = 0;//扫描坐标
        boolean flag = false;//对角线扫描方式：true为右上至左下，false为左下至右上
        while (x < n && y < n)//对角线输出
        {
            System.out.print(matrix[y][x] + " ");
            if (x == n - 1 && !flag)//到达右边界
            {
                y++;
                if (y > n - 1)
                    break;
                System.out.print(matrix[y][x] + " ");

                flag = true;
            } else if (y == n - 1 && flag)//到达下边界
            {
                x++;
                if (x > n - 1)
                    break;
                System.out.print(matrix[y][x] + " ");
                flag = false;
            } else if (y == 0 && !flag)//到达上边界
            {
                x++;
                System.out.print(matrix[y][x] + " ");
                flag = true;
            } else if (x == 0 && flag)//到达左边界
            {
                y++;
                System.out.print(matrix[y][x] + " ");
                flag = false;
            }

            if (flag)//对角线扫描右上至左下
            {
                x--;
                y++;
            } else//对角线扫描左下至右上
            {
                x++;
                y--;
            }

        }

    }

}


