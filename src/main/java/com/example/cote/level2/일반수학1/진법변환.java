package com.example.cote.level2.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환 {
    /**
     * x진법 z를 10진법으로 변환 후 출력하시오.
     */
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String x = st.nextToken();
        result = Integer.parseInt(Integer.toString(Integer.parseInt(x), 10));
        System.out.println(result);
    }
}
