package com.example.cote.level2.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드 {
    /**
     * m개의 카드들 중 n카드들에 포함되어 있다면 1 그렇지 않다면 0을 출력하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] x = new int[n];
        for (int i = 0; i < n; i++) x[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] y = new int[m];
        for (int i = 0; i < m; i++) y[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(x);
        for (int i = 0; i < m; i++) {
            int chk = Arrays.binarySearch(x, y[i]);
            if (chk < 0) sb.append(0).append(" ");
            else sb.append(1).append(" ");
        }
        System.out.println(sb);
    }
}
