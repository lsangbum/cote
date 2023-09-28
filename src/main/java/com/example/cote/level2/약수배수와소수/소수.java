package com.example.cote.level2.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {
    /**
     * 두 줄로 입력 된 숫자 2개를 기준으로
     * 소수의 합을 구하고 그 중 최솟값을 함께 프린트하라
     */
    static int x, y, min, sum, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        for (int i = x; i <= y; i++) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }
        if (sum == 0) System.out.println(-1);
        else System.out.print(sum + "\n" + min);
    }
}
