package day10;

import java.util.Scanner;

/**
 * @author zhongyanzu
 * @create 2020-12-02 13:53
 */
public class test1803_1 {
    public static void main(String[] args) {




                Scanner sc = new Scanner(System.in);
                int score = 0;
                int time = 0;
                boolean lastTimeIs1 = false;
                int currentSc = 0;

                while (sc.hasNextInt()) {
                    time++;
                    int st = sc.nextInt();
                    if (st == 1) {
                        score++;
                        lastTimeIs1 = true;
                        currentSc = 1;
                    } else if (st == 2) {
                        if (time == 1 || lastTimeIs1) {
                            currentSc = 2;
                        } else {
                            currentSc += 2;
                        }
                        score += currentSc;

                        lastTimeIs1 = false;
                    } else if (st == 0) {
                        lastTimeIs1 = false;
                        break;
                    }
                }
                System.out.println(score);

                sc.close();
            }

        }