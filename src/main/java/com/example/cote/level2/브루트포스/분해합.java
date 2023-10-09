package com.example.cote.level2.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 분해합 {
    /**
     * 입력받은 수 의 가장 작은 생성자를 구하시오.
     * 생성자란 본인 + 각자리 수의 합이 최초의 값과 같은 경우를 의미한다.
     * ex ) 216의 생성자는 207(207 + 2 + 0 + 7 = 216), 198(198 + 1 + 9 + 8 = 216) 이다.
     * 최초의 수 x 변수
     * 수의 합이 x와 같은 지 확인용 y 변수
     * 반복하여 각자리 수를 갱신하며 더해줄 z 변수
     * 생성자일 경우 그 수를 확인하여 List에 추가할 chk 변수를 활용
     * List 가 null 인경우 생성자가 없는 것으로 0 출력
     * List 에 add 되는 수는 큰 수부터 차례로 add 되므로 마지막 인덱스를 출력
     */
    static int x, y, z, chk;
    static List<Integer> res = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());

        for (int i = 0; i <= x; i++) {
            chk = y = z = x - i;
            while (z != 0) {
                y += (z % 10);
                z = z / 10;
            }
            if (y == x) res.add(chk);
        }
        if (res.isEmpty()) System.out.println(0);
        else System.out.println(res.get(res.size() - 1));

    }
}
