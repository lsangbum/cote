package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기 {
    /**
     * 입력 받은 수 사이 소수를 출력하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        //배열 초기화
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        //2부터 시작해서 i의 배수들을 배열에서 지워준다
        for (int i = 2; i <= n; i++) {
            //이미 지워진 수는 건너뛴다
            if (arr[i] == 0) continue;
            for (int j = i+i; j <= n; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = m; i <= n; i++) {
            if (arr[i] != 0) sb.append(i + "\n");
        }
        System.out.print(sb);

        /*for (int i = x; i <= y; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) if (i % j == 0) count++;
            if (count == 2) sb.append(i).append("\n");
        }
        System.out.println(sb);*/
    }
}
