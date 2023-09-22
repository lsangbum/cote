package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자와문자열 {

    /**
     * str = 입력받은 문자열
     * index = 입력받은 위치
     * result = 특정 위치 문자
     */
    static String str;
    static int index;
    static char result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        index = Integer.parseInt(br.readLine()) - 1;
        result = str.charAt(index);
        System.out.println(result);

    }
}