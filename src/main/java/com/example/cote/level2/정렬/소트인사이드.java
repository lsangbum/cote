package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드 {
    /**
     * 입력 받은 수를 내림차순으로 출력하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] x = br.readLine().toCharArray();

        Arrays.sort(x);
        for (int i = x.length - 1; i >= 0; i--) sb.append(x[i]);

        System.out.println(sb);
    }
}
