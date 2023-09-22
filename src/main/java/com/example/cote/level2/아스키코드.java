package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드 {

    /**
     * 문자를 받아 아스키코드로 변환하시오
     * ascll = 변환한 아스키코드
     */
    static byte ascll;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ascll = (byte) br.readLine().charAt(0);
        System.out.println(ascll);
    }

}
