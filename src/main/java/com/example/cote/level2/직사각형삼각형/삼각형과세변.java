package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 삼각형과세변 {
    static int[] x;
    static final String equilateral = "Equilateral";
    static final String isosceles = "Isosceles";
    static final String scalene = "Scalene";
    static final String invalid = "Invalid";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            x = new int[st.countTokens()];
            for (int i = 0; i < x.length; i++) x[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(x);
            if (x[0] != 0 && x[1] != 0 && x[2] != 0) {
                if (x[2] >= x[0] + x[1]) System.out.println(invalid);
                else if (x[0] == x[1] && x[0] == x[2]) System.out.println(equilateral);
                else if (x[0] == x[1] || x[0] == x[2] || x[1] == x[2]) System.out.println(isosceles);
                else System.out.println(scalene);
            } else return;
        }
    }
}
