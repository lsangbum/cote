package com.example.cote.level2.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스 {

    /**
     * 부족한 체스 말의 갯수를 구하시오 킹1 퀸1 룩2 비숍2 나이트2 폰8
     */
    static final int[] x = {1, 1, 2, 2, 2, 8};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < x.length; i++) {
            sb.append(x[i] - Integer.parseInt(st.nextToken())).append(" ");
        }

        System.out.println(sb.toString());
    }

}
