package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 상수 {

    static int[] x;
    static StringBuffer sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);

        x = new int[st.countTokens()];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        }
        System.out.println(Arrays.stream(x).max().getAsInt());
    }
}
