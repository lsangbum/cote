package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 평균 {
    /**
     * n = 과목 수
     * m = 과목 중 최고 점
     * testScores = 실제 점수 리스트
     * fakeScores = 조작 점수 리스트
     * average = 평균
     */
    static int n;
    static double m, sum, average;
    static double[] testScores, fakeScores;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());    //과목 수
        st = new StringTokenizer(br.readLine(), " ", false);    //실제 점수
        testScores = new double[n];
        for (int i = 0; i < n; i++) {
            testScores[i] = Double.parseDouble(st.nextToken());
        }

        m = Arrays.stream(testScores).max().getAsDouble(); //최고 점수
        fakeScores = new double[n];
        for (int i = 0; i < n; i++) {
            fakeScores[i] = testScores[i] / m * 100;
        }
        sum = Arrays.stream(fakeScores).sum();
        average = sum / n;

        System.out.println(average);
    }
}
