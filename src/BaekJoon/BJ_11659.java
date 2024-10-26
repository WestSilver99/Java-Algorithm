package BaekJoon;

import java.util.Scanner;

public class BJ_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("데이터의 개수 : ");
        int N = sc.nextInt(); // 수의 개수

        System.out.print("질의 개수 : ");
        int M = sc.nextInt(); // 합을 구해야 하는 횟수

        int[] sumArr = new int[N + 1]; // 합배열

        System.out.print("숫자 입력 : ");
        for (int i = 1; i <= N; i++) {
            sumArr[i] = sumArr[i - 1] + sc.nextInt();
        }

        for(int i = 0; i < M; i++) {
            System.out.print("범위 입력 : ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sumArr[end] - sumArr[start - 1]);
        }
    }
}
