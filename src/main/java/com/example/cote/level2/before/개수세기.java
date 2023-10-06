package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x, y, result = 0;


        x = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
        y = Integer.parseInt(br.readLine());

        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == y) {
                result++;
            }
        }
        System.out.println(result);
    }
}
