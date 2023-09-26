package com.example.cote.level2.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배수와약수 {
    /**
     * 두 수의 약수, 배수 관계를 프린트 하시오.
     */
    static int x, y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");;
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if (x == 0 && y == 0) {
                return;
            } else if ((x % y) == 0) {
                System.out.println("multiple");
            } else if ((y % x) == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
