package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나이순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        String y[][] = new String[x][2];
        StringTokenizer st;
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                y[i][j] = st.nextToken();
            }
        }
        Arrays.sort(y, (y1, y2) -> Integer.parseInt(y1[0]) - Integer.parseInt(y2[0]));
        for (int i = 0; i < x; i++) {
            sb.append(y[i][0]).append(" ").append(y[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
