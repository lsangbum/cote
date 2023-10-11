package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
    /**
     * 입력 받은 N개의 수 중에
     * 두번 째로 입력 받은 M개 각각의 수가 포함되어 있는지
     * 출력하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < x.length; i++) x[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(x);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(x, Integer.parseInt(st.nextToken())) < 0) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }
        System.out.println(sb);

        /*int x = Integer.parseInt(br.readLine());
        String[] arr = new String[x];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < x; i++) arr[i] = st.nextToken();

        int y = Integer.parseInt(br.readLine());
        String[] arr2 = new String[y];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < y; i++) arr2[i] = st.nextToken();

        for (int i = 0; i < x; i++) {
            if (Arrays.stream(arr).anyMatch(arr2[i]::equals)) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }

        System.out.println(sb);*/
    }
}
