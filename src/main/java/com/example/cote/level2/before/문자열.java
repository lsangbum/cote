package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열 {
    static int writeQuantity;
    static char start, end;
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        writeQuantity = Integer.parseInt(br.readLine());
        for (int i = 0; i < writeQuantity; i++) {
            str = br.readLine();
            start = str.charAt(0);
            end = str.charAt(str.length() - 1);
            System.out.println(start+""+end);
        }
    }
}
