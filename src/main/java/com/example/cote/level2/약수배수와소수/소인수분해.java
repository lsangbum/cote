package com.example.cote.level2.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {

    /**
     * 입력 받은 값을 소인수분해 하여 그 값들을 출력하시오.
     */
    static int x;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());

        for (int i = 2; i <= x; i++) {
            while ((x % i) == 0) {
                x = x / i;
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

}
