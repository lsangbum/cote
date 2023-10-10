package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 커트라인 {
    /**
     * 첫번 째 줄에 학생 수와 상을 받을 학생 수가 주어진다.
     * 상을 받을 학생 중 가장 낮은 점수가 커트라인이 된다.
     * 커트라인을 출력하시오.
     */
    static int x, y, res;
    static int[] z;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        z = new int[x];
        for (int i = 0; i < x; i++) {
            z[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(z);
        System.out.println(z[x - y]);
    }
}
