package day18;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-12 19:29
 */
public class test1512_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 输入
        int[][] table = new int[n][m];
        for ( int i = 0; i < n; i++ )
            for ( int j = 0; j < m; j++ )
                table[i][j] = sc.nextInt();

        int[][] eli = new int[n][m];   // 是否消除

        // 处理行
        for ( int i = 0; i < n; i++) {
            int count = 1, end = 0;
            for ( int j = 0; j < m; j++ )
                if( j == m - 1 || table[i][j] != table[i][j+1] ) {  // 惰性保证数组不会越界
                    if ( count >= 3)
                        for(int p = end; p >= end - count + 1; p--)
                            eli[i][p] = 1;
                    count = 1;
                } else { count++; end = j+1; }
        }

        // 处理列
        for ( int i = 0; i < m; i++){
            int count = 1, end = 0;
            for ( int j = 0; j < n; j++)
                if( j == n-1 || table[j][i] != table[j+1][i] ) {
                    if ( count >= 3)
                        for ( int p = end; p >= end - count + 1; p--)
                            eli[p][i] = 1;
                    count = 1;
                } else { count++; end = j+1; }
        }

        // 消除
        for(int i = 0;i < n;i++)
            for(int j = 0;j < m;j++)
                if(eli[i][j] == 1)
                    table[i][j] = 0;

        //输出
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++)
                System.out.print(table[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }

}
