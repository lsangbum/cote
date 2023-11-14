package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 검증수 {
    /**
     * 입력 받은 각 수들의 제곱을 더하여(sum) 검증수를 구하시오.
     * 검증수란 sum % 10 을 의미한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        sum %= 10;
        System.out.println(sum);
    }
}
