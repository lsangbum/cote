package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 코딩은체육과목입니다 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine()) / 4;
        String result = "long ";

        System.out.println(result.repeat(x) + "int");
//        for (int i = 0; i < x / 4; i++) {
//            result += "long ";
//        }
//        System.out.println(result + "int");
    }
}
