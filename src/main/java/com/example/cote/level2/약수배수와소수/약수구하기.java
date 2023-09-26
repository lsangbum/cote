package com.example.cote.level2.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {
    /**
     * 정수 x, y가 주어짐
     * x 의 약수 중 y 번째로 작은 수를 출력하시오.
     */
    static int x, y, count;
    static int[] z;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = new int[x];
        for (int i = 1, j = 0; i <= x; i++) {
            if ((x % i) == 0) {
                z[j] = i;
                j++;
                count++;
            }
        }
        if (y <= count) {
            System.out.println(z[y - 1]);
        } else {
            System.out.println(0);
        }
    }
}
