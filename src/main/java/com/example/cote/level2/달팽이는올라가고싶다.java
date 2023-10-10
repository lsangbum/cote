package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    /**
     * 낮에 x 업, 밤에 y 다운 목표 높이 z 까지 달성 하기 위해 걸리는 시간을 구하시오.
     */
    static int x, y, z, chk, res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        x = Integer.parseInt(st.nextToken());   //올라갈 수
        y = Integer.parseInt(st.nextToken());   //내려갈 수
        z = Integer.parseInt(st.nextToken());   //목표 수

        /**
         * 마지막 날은 떨어지지 않으니 (목표 수 - 올라갈 수) 재설정
         * (올라갈 수 - 내려갈 수) 하여 하루 평균 올라갈 수 재설정
         * 두 수를 나누어 나머지를 확인하여 출력해준다.
         */
        res = (z - x) / (x - y);
        chk = (z - x) % (x - y);
        if (chk == 0) System.out.println(++res);
        else System.out.println(res + 2);
    }

}
