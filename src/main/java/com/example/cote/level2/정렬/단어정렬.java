package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        String[] strArr = new String[x];
        for (int i = 0; i < strArr.length; i++) strArr[i] = br.readLine();
        Arrays.sort(strArr);    //자바의 내장함수인 sort 의 경우 정렬 시 사전 순으로 정렬해준다.
        Arrays.sort(strArr, (String strArr1, String strArr2) -> strArr1.length() - strArr2.length());   //사전 순으로 정렬된 배열을 길이순으로 재정렬 해준다.
        String[] resArr = Arrays.stream(strArr).distinct().toArray(String[]::new);

        for (int i = 0; i < resArr.length; i++) sb.append(resArr[i]).append("\n");
        System.out.println(sb);
    }
}
