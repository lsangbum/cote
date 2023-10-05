package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수학은체육과목입니다 {
    /**
     * 최하단 사각형의 갯수가 주어졌을 때 해당 도면의 둘레를 구하시오.
     * 일련의 규칙이 있음.
     * 최하단 도형의 갯수 * 4
     * 요구사항의 입력 값이 int를 초과하기 때문에 long 타입으로 받아야함
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Integer.parseInt(br.readLine());
        System.out.println(x * 4);
    }
}
