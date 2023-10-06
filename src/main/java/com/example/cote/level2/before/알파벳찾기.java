package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {
    static String str;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(str.indexOf(i)).append(" ");
        }
        System.out.println(sb.toString());
    }

}
