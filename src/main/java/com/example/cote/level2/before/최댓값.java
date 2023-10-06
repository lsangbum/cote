package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[9];
        int max = 0, index = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(br.readLine());
            if (max < x[i]) {
                max = x[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
