package BaekJoon;

import java.util.Scanner;

public class BJ_11660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 2차원 배열의 크기
        int M = sc.nextInt(); // 질의의 개수

        int [][] arr = new int[N+1][N+1];
        int [][] sumArr = new int[N+1][N+1];

        // 원본 배열 저장
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
            }
        }

        for(int i = 0; i< M; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int result = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1];
            System.out.println(result);
        }




    }
}
