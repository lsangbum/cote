package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세막대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) x[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(x);
        int y = x[0] + x[1];
        int z = x[2];

        if (y <= z) z = y - 1;

        System.out.println(y + z);
    }
}
