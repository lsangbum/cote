package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병영외급식 {
    /**
     * 생활관 수 x와 인당 피자 수 y가 주어지고
     * 다음 줄에 각 생활관 당 인원수가 주어질 경우
     * 각 인원 당 피자 y개를 나눌 수 있으면 1
     * 그렇지 않으면 0을 출력하시오.
     */
    static int x, y, sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
        if (sum % y == 0) System.out.println(1);
        else System.out.println(0);



    }
}
