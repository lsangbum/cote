package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열과반복 {

    /**
     * n개의 문자열을 받는다
     * n문자열의 각 문자를 m번 반복한다
     * result 의 변수에 반복된 문자를 넣어 출력한다
     */
    static int n, m;
    static String str, charStr;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                charStr = str.substring(j, j + 1);
                for (int h = 0; h < m; h++) {
                    sb.append(charStr);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }

}
