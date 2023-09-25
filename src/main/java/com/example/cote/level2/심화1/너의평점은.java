package com.example.cote.level2.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 너의평점은 {
    /**
     * 학점이 P / F 인 것을 제외 평점을 구하시오
     * 학점 X 과목평점 / 학점의 총합
     */
    static StringTokenizer st;
    static double totalScore = 0, myScore = 0, result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> subjectClass = new HashMap<>();
        subjectClass.put("A+", 4.5);
        subjectClass.put("A0", 4.0);
        subjectClass.put("B+", 3.5);
        subjectClass.put("B0", 3.0);
        subjectClass.put("C+", 2.5);
        subjectClass.put("C0", 2.0);
        subjectClass.put("D+", 1.5);
        subjectClass.put("D0", 1.0);
        subjectClass.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String classNm = st.nextToken();

            if (!classNm.equals("P")) {
                totalScore += grade * subjectClass.get(classNm);
                myScore += grade;
            }
        }
        result = totalScore / myScore;
        System.out.println(String.format("%.6f", result));
    }
}
