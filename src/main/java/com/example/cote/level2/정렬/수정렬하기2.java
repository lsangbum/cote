package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int[] y = new int[x];
        for (int i = 0; i < x; i++) y[i] = Integer.parseInt(br.readLine());

        Arrays.sort(y);
        for (int j = 0; j < x; j++) sb.append(y[j]).append("\n");
        System.out.println(sb);
    }
}
