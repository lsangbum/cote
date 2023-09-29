package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 직사각형 {
    /**
     * 입력 받은 가로, 세로 임의의 수를 받아 직사각형의 넓이를 구하시오.
     */
    static int x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        System.out.println(x * y);
    }

}
