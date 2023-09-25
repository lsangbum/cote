package com.example.cote.level2.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 그룹단어 {
    /**
     * 연속된 단어는 그룹단어 단어가 떨어져있는 경우 그룹단어가 아님
     * ex ) aabbcc 그룹단어 aabbcca 그룹단어아님 - a가 떨어져 있음
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < cases; i++) {
            char beforeChar = 0;    //이전 문자
            int changeCnt = 0;      //변경 횟수 ex) aba처럼 이어지지 않는 경우 마지막 a가 이전 문자와 달라 change변수는 ++ 되지만 HashSet공간에는 이미 a가 존재함으로 add되지 않음 
            char[] str = br.readLine().toCharArray();
            HashSet<Character> usedAlphabet = new HashSet<>();

            for (int j = 0; j < str.length; j++) {
                if (beforeChar != str[j]) {
                    beforeChar = str[j];
                    changeCnt++;
                    usedAlphabet.add(str[j]);
                }
            }
            if (usedAlphabet.size() == changeCnt) result++; //결국 그룹단어는 변경된 횟수와 HashSet 변수의 size가 동일해야 함
        }
        System.out.println(result);
    }
}
