package com.example.cote.level2.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값 {
    /**
     *  9 X 9 그리드에 들어갈 수를 입력받는다.
     *  그 중 가장 큰 수와 해당 좌표를 표시하라.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = -1;       //max값
        int x = 0, y = 0;   //좌표
        int[][] grid = new int[10][10]; //0 X 0 을 공백으로 생각하고 10 X 10의 공간을 생성
        for (int i = 1; i < grid.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j < grid.length; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print(max + "\n" + x + " " + y);
    }
}
