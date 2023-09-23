package com.example.cote.level2.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬확인 {
    /**
     * 거꾸로 읽어도 같은 단어 인 것을 고르시오
     * 맞으면 1 틀리면 0
     */
    static String str;  //input 문자열
    static int len;     //문자열 길이
    static int result;  //결과값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        len = str.length();
        result = 1;
        for (int i = 0; i < len; i++, len--) {
            if (i != len) {
                if (str.charAt(i) != str.charAt(len - 1)) {
                    result = 0;
                    break;
                }
            } else  break;
        }
        System.out.println(result);
    }

}
