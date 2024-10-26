package BaekJoon;

import java.util.Scanner;

public class BJ_10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N+1];
        int [] newArr = new int[N+1];
        int answer = 0;
        
        for(int i = 1; i<=N; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for(int i = 1; i<=N; i++){
            int count = (int)arr[i] % M;

            // M으로 나누었을 때의 나머지가 idx가 됨
            // ex) 1,3,6,7,9에서 3으로 나눈 나머지인 0과1이 idx가 됨
            // idx의 값들이 나머지의 개수

            if(count == 0){
                answer++;
            }
            newArr[count] ++;
        }

        for(int i = 0; i< newArr.length; i++){

            // 나머지의 개수가 2개 이상이어야 짝을 지을 수가 있음
            // ex) 2C2 3C2
            if(newArr[i] > 1){
                answer += comb(newArr[i]);
            }
        }

        System.out.println(answer);
    }

    public static int comb(int x){
        return (x*(x-1))/2;
    }
}
