package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합 {
    static int x, sum;
    static String y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        y = br.readLine();
        for (int i = 0; i < x; i++) {
            sum += Integer.parseInt(String.valueOf(y.charAt(i)));
        }
        System.out.println(sum);
    }

}
