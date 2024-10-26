package BaekJoon;

import java.util.Scanner;

public class BJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        float sum = 0;

        float max = -99999;

        int[] score = new int[N];

        for(int i = 0; i< score.length; i++){
            score[i] = sc.nextInt();
            if(score[i]>max){
                max = score[i];
            }
        }

        for(int i = 0; i< score.length; i++){
            score[i] = (int) ((score[i] / max) * 100.0);
            sum += score[i];
        }

        System.out.println(sum/N);

    }
}
