package com.example.cote.level2.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
    /**
     * 100 X 100 공간에 10 X 10 색종이를 두고 색종이가 차지한 공간의 크기를 구하시오
     * ex ) 3장인 경우 총 10 X 30 총 300의 공간 40의 공간이 겹친 경우 300 - 40 = 260의 너비가 된다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        /* 색종이(paperQuantity) 수 만큼 입력받기 */
        int paperQuantity = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        for (int i = 0; i < paperQuantity; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            /* 좌표 값을 기준으로 모든 공간에 표시를 해준다. */
            for (int j = x; j < x + 10; j++) {
                for (int h = y; h < y + 10; h++) {
                    paper[h][j] = 1;
                }
            }
        }

        // 2차원 배열 출력. 1인 숫자만 더하기.
        int result = 0;
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper.length; j++) {
                if (paper[i][j] == 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
