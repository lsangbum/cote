package com.example.cote.level2.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳 {

    static String str;
    static String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        for (int i = 0; i < croatiaAlphabet.length; i++) {      //크로아티아 문자 확인을 위한 크로아티아 문자배열 크기만큼 반복
            if (str.contains(croatiaAlphabet[i])) {             //입력받은 문자열에 크로아티아 문자 포함여부 확인 조건문 
                int cntWord = countOccurrencesOf(str, croatiaAlphabet[i]);  //입력받은 문자열에 크로아티아 문자가 몇번 포함되어 있는지 확인
                str = str.replaceAll(croatiaAlphabet[i], "/");                   //입력받은 문자열에서 크로아티아 문자 제거 / 제거 후 전후 단어가 합쳐지는 경우를 대비 특정 문자로 치환
                result += cntWord;      //입력받은 문자열에 포함 된 크로아티아 문자 갯수 체크
            }
        }
        str = str.replaceAll("/", "");    //특정문자 제거
        result += str.length();     //주어진 크로아티아 문자 외 다른 단어는 각각이 한단어 씩 인식하여 남은 문자열 길이 플러스
        System.out.println(result);
    }

    /**
     * org.springframework.util.StringUtils 참조
     */
    static int countOccurrencesOf(String str, String sub) {
        if (!hasLength(str) || !hasLength(sub)) {
            return 0;
        }

        int count = 0;
        int pos = 0;
        int idx;
        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + sub.length();
        }
        return count;
    }

    static boolean hasLength(String str) {
        return (str != null && !str.isEmpty());
    }
}

