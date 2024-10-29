package BaekJoon.TwoPointer;

import java.util.Scanner;

public class BJ_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

       int start_index = 1;
       int end_index = 1;
       int sum = 1;
       int count = 1;

       while (end_index != N){
            if(sum < N){
                end_index++;
                sum+=end_index;
            }
            /*
            sum에서 start_index를 빼면 해당 start_index을 제외한 수부터의 총 합임.
             */
            else if (sum>N) {
                sum-=start_index;
                start_index++;
            }
            else {
                count++;
                end_index++;
                sum+=end_index;
            }
       }

        System.out.println(count);

    }
}
