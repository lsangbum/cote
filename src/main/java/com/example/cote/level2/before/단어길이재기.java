package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기 {

    /**
     * 입력받은 문자열의 길이를 구하시오
     * str = 입력받은 문자열
     * len = 입력받은 문자열의 길이
     */
    static String str;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        len = str.length();
        System.out.println(len);
    }

}
