package com.example.cote.level2.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기 {
    /**
     * 5줄의 랜덤한 문자열(최대 15자)을 세로로 읽으시오.
     * 단, 공백의 경우 무시하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String result;
        char str[];

        /* grid에 입력값 삽입 */
        String[][] grid = new String[5][15];
        for (int i = 0; i < 5; i++) {
            str = br.readLine().toCharArray();
            for (int j = 0; j < str.length; j++) {
                grid[i][j] = String.valueOf(str[j]);
            }
        }
        /* 그리드 데이터 세로 읽기 */
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(grid[j][i]);
            }
        }
        /* 값이 없는 경우 null이 출력되는데 해당 값 공백으로 변환 */
        result = sb.toString().replace("null", "");
        System.out.println(result);
    }
}

