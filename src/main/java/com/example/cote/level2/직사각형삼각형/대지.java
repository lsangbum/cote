package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대지 {
    /**
     * 대지의 평수를 구하시오.
     * 각 좌표의 최대값과 최솟값을 구한 뒤 연산하여 출력하면됨.
     * max, min 확인용 변수 생성 xr, xl, yr, yl x의 좌우 y의 좌우용
     * min의 경우 초기값으로 입력받을 수 있는 최대값을 입력
     */
    static int n, xr = -10000, yr = -10000, xl = 10000, yl = 10000, chk1, chk2, res;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                chk1 = Integer.parseInt(st.nextToken());
                chk2 = Integer.parseInt(st.nextToken());
                if (chk1 > xr) xr = chk1;
                if (chk2 > yr) yr = chk2;
                if (chk1 < xl) xl = chk1;
                if (chk2 < yl) yl = chk2;
            }
            res = (xr - xl) * (yr - yl);
            System.out.println(res);
        } else System.out.println(0);
    }
}
