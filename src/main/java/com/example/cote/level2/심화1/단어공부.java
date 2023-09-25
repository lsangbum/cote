package com.example.cote.level2.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단어공부 {
    /**
     * 단어를 입력 받은 후
     * 입력 받은 단어 중
     * 가장 많이 사용 된
     * 알파벳을 출력하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toUpperCase().toCharArray(); //입력 값 대문자 변환 후 char 타입 배열로 저장
        int[] alphabet = new int[26];   //입력값 카운팅을 위한 알파벳 배열
        int alpabetIndex;   //입력 알파벳 순서를 알기 위한 알바벳 인덱스 ex) C인 경우 67 - 65(대문자 A char값) 하여 2가 저장되며 alphabet[2] 자리에 +1이 된다.
        int maxNum = -1;    //alphabet 배열의 최대값을 구하기 위한 최소값 각 배열의 기본값은 0이다.
        char result = 0;    //alphaber 배열의 최대값에 + 65 하여 특정 알파벳을 저장한다. ex) char 타입에 65를 넣을 경우 대문자 A가 저장된다.

        for (int i = 0; i < str.length; i++) {
            alpabetIndex = str[i] - 65;
            alphabet[alpabetIndex]++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > maxNum) {
                maxNum = alphabet[i];
                result = (char) (i + 65);
            } else if (alphabet[i] == maxNum) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
