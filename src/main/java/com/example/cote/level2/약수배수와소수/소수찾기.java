package com.example.cote.level2.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {
    /**
     * 확인 정수의 갯수와 각 정수들을 입력 받아 소수의 수를 구하시오.
     * x = 정수 갯수
     * y = 입력 받은 정수
     * z = 약수 갯수 체크
     * res = 소수 갯수 체크
     * tip. 1은 자연수 중에서 유일하게 소수도 아니고, 합성수도 아닌 수다.
     */
    static int x, y, z, res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < x; i++) {
            y = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= y; j++) if ((y % j) == 0) z++;
            if (z == 2) res++;
            z = 0;
        }
        System.out.println(res);
    }
}
