package day12;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-04 14:57
 */
public class test1512_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int mp[][] = new int[35][35];
        boolean[][] vis = new boolean[35][35];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                mp[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= m; j++) {
                if(mp[i][j]==mp[i+1][j] && mp[i][j]==mp[i+2][j])
                {vis[i][j]=vis[i+1][j]=vis[i+2][j]=true;}
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m - 2; j++) {
                if(mp[i][j]==mp[i][j+1] && mp[i][j]==mp[i][j+2])
                {vis[i][j]=vis[i][j+1]=vis[i][j+2]=true;}
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (vis[i][j]) {
                    System.out.print(0+" ");
                } else {
                    System.out.print(mp[i][j]+" ");
                }
            }
            System.out.println();
        }

        }


}


