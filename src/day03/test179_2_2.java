package day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-11-13 20:20
 */
public class test179_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Teacher1> arrt1 = new ArrayList<>();
        ArrayList<Integer> key = new ArrayList<>();
        int time = 1;
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 1; i <= K; i++) {
            Teacher1 t = new Teacher1(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            arrt1.add(t);
        }
        while (time <= maxTime(arrt1)) {
            returnKey(time, arrt1, arr, key);
            borrowKey(time, arrt1, arr);
            time++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void borrowKey(int time, ArrayList<Teacher1> arrt1, int[] arr) {
        for (int i = 0; i < arrt1.size(); i++) {
            if (time == arrt1.get(i).s) {
                for (int j = 0; j < arr.length; j++) {
                    if (arrt1.get(i).w == arr[j]) {
                        arr[j]=0;
                        break;
                    }
                }
            }

        }
    }

    private static void returnKey(int time, ArrayList<Teacher1> arrt1, int[] arr, ArrayList<Integer> key) {
        key.clear();
        for (int i = 0; i < arrt1.size(); i++) {
            if (time == arrt1.get(i).e) {
                key.add(arrt1.get(i).w);
            }
        }
        if (key.isEmpty()) {
            return;
        } else {
//            Collections.sort(key);
            for (int i = 0; i < key.size() - 1; i++) {
                for (int j = 0; j < key.size() - 1 - i; j++) {
                    if (key.get(j) > key.get(j + 1)) {
                        int temp = key.get(j);
                        key.set(j, key.get(j + 1));
                        key.set(j + 1, temp);
                    }
                }
            }

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = key.get(j);
                    if (key.size() - 1 == j) {
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
    }


    private static int maxTime(ArrayList<Teacher1> arrt1) {
        int temp = 0;
        for (int i = 0; i < arrt1.size(); i++) {
            if (arrt1.get(i).e > temp) {
                temp = arrt1.get(i).e;
            }
        }

        return temp;
    }
}

class Teacher1 {
    int w;
    int s;
    int c;
    int e;

    public Teacher1(int w, int s, int c) {
        this.w = w;
        this.s = s;
        this.c = c;
        this.e = this.s + this.c;
    }
}