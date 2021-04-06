package day07;
import java.util.Scanner;
/**
 * @author zhongyanzu
 * @create 2020-11-29 13:59
 */
public class test206_2_2 {




        public static void main(String[] args){
            //1. 接收数据 n, a, b
            int n, a, b;
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            a = scan.nextInt();
            b = scan.nextInt();

            //2.1 接收向量 u 的稀疏表示数据
            int[] u_index = new int[a];
            int[] u_value = new int[a];
            for(int i=0; i<a; i++){
                u_index[i] = scan.nextInt();
                u_value[i] = scan.nextInt();
            }

            //3. 初始化最后结果
            long result = 0L;
            int v_index, v_value;
            int index_u = 0;
            for(int i=0; i<b; i++){
                v_index = scan.nextInt();
                v_value = scan.nextInt();

                while(index_u < a && i<a && index_u < b){
                    if(u_index[index_u] == v_index){
                        result += v_value * u_value[index_u];
                        index_u++;
                        break;
                    }else if(u_index[index_u] < v_index){
                        index_u++;
                    }else{
                        break;
                    }
                }
            }

            //4. 输出结果
            System.out.println(result);
        }
    }

