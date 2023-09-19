package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
        int[] y = new int[x];
        int max, min;

        for (int i = 0; i < x; i++) {
            y[i] = Integer.parseInt(st.nextToken());
        }

        max = Arrays.stream(y).max().getAsInt();
        min = Arrays.stream(y).min().getAsInt();
        System.out.println(min + " " + max);

    }
}
