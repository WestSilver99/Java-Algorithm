package BaekJoon.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] arr = new int[N];

        //int temp;


        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        for(int i = 0; i<N; i++){
//            for (int j = 0; j<N; j++){
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);

        int count = 0;
        int start_index = 0, end_index = N-1;

        while(start_index<end_index){
            if(arr[start_index] + arr[end_index]<M){
                start_index++;
            } else if (arr[start_index] + arr[end_index] == M) {
                count++;
                start_index++;
                end_index--;
            }else {
                end_index--;
            }
        }
        System.out.println(count);
    }
}
