package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대표값 {
    static int sum, res;
    static int[] x = new int[5];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            x[i] = Integer.parseInt(br.readLine());
            sum += x[i];
        }
        Arrays.sort(x);
        res = sum / 5;
        System.out.println(res + "\n" + x[2]);
    }
}
