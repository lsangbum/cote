package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {
    /**
     * A좌표 x,y / 직사각형 오른쪽 위 끝 좌표 B w,h
     * A좌표 좌표에서 최단거리 변과의 거리를 출력하시오.
     */
    static int x, y, w, h, intervalX, intervalY, res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());    //x
        y = Integer.parseInt(st.nextToken());    //y
        w = Integer.parseInt(st.nextToken());    //x
        h = Integer.parseInt(st.nextToken());    //y

        intervalX = Math.min((w - x), x);  //x, w 거리
        intervalY = Math.min((h - y), y);  //h, y 거리
        res = Math.min(intervalX, intervalY);
        System.out.println(res);
    }

}
