package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 큰수AB {
    /**
     * 입력 받은 두 수의 합을 출력하시오.
     * 요구사항의 데이터 범위를 확인 후 데이터를 받거나 변환할 타입을 선택하시오.
     * BigInteger 클래스 사용
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger x = new BigInteger(st.nextToken());
        BigInteger y = new BigInteger(st.nextToken());

        x = x.add(y);

        System.out.println(x);
    }
}
