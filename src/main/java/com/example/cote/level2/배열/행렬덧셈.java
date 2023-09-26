package com.example.cote.level2.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬덧셈 {
    /**
     * 두 행열의 합을 구하시오
     * 두 행열의 크기는 입력된 두 숫자로 정해집니다.
     */
    static int[][] x;
    static int[][] y;
    static int[][] z;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* x 생성 후 입력 값 삽입*/
        x = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                x[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* y 생성 후 입력 값 삽입과 동시에 x + y를 z에 삽입
         * 한번 돌때마다 StringBuild에 삽입 된 값 프린트*/
        y = new int[n][m];
        z = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                y[i][j] = Integer.parseInt(st.nextToken());
                z[i][j] = x[i][j] + y[i][j];
                sb.append(z[i][j]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
