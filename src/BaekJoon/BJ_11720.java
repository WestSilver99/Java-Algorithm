package BaekJoon;

import java.util.Scanner;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        int[] arr = new int[N];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(sum);



    }
}
