package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공넣기 {
    /*
     * n = 바구니 수
     * m = 넣을 공의 번호
     * x = 각 바구니의 공번호 배열
     */
    static int n, m;
    static int[] x;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());

            insertBall(start, end, ballNum);
        }
        selectBall();

    }

    /**
     * start ~ end 까지 ballNum 저장
     */
    static void insertBall(int start, int end, int ballNum) {
        for (int i = start; i <= end; i++) {
            x[i] = ballNum;
        }
    }

    /**
     * x 배열에 담긴 값 StringBuilder 변수 sb에 하나 씩 담아 프린트
     */
    static void selectBall() {
        for (int i = 1; i < x.length; i++) {
            sb.append(x[i]).append(" ");
        }
        System.out.println(sb.toString());
    }


}
