package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼 {

    /**
     * 문자를 받아 그 문자가 가르키는 숫자를 찾은 후 각 숫자의 합에 숫자 총길이의 * 2를 더하라
     */
    static char[] x;
    static String[] y = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
    static int sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = br.readLine().toCharArray();
        for (int i = 0; i < x.length; i++) {
            for (int j = 2; j < y.length; j++) {
                if (y[j].contains(String.valueOf(x[i]))) {
                    sum += j + 1;
                }
            }
        }
        System.out.println(sum);
    }


}
