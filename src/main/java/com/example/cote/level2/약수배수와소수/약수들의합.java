package com.example.cote.level2.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수들의합 {
    /**
     * 입력 값이 완전 수 인 경우 아래와 같이 출력하시오.
     * ex 6 = 1 + 2 + 3 / 완전수 인 경우
     * ex 12 is NOT perfect. / 아닌 경우
     */
    static int x, sum;
    static String result;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());
        while (true) {
            sum = 0;    //초기화
            sb = new StringBuilder();   //초기화
            if (x != -1) {
                for (int i = 1; i <= x; i++) {
                    if (i != x && (x % i) == 0) {
                        sum += i;
                        sb.append(i).append(" + ");
                    }
                }
                if (x == sum) {
                    result = sb.toString().substring(0, sb.toString().length() - 3);
                    System.out.println(x + " = " + result);
                } else {
                    System.out.println(x + " is NOT perfect.");
                }
                x = Integer.parseInt(br.readLine());
            } else return;
        }
    }
}
