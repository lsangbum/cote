package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바구니뒤집기 {
    static int n, m;
    static int[] baskets;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        /**
         * n개의 바구니
         * m번의 변경
         * x부터 z까지 리버스
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);

        n = Integer.parseInt(st.nextToken());   //바구니 수
        m = Integer.parseInt(st.nextToken());   //변경 횟 수

        setBasketNumber(n);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ", false);
            setReverseBasketNumber(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        printBasketNumber(baskets);
    }

    /* 바구니 숫자부여 */
    static void setBasketNumber(int n) {
        baskets = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            baskets[i] = i;
        }
    }
    /* 숫자뒤집기 */
    static void setReverseBasketNumber(int x, int z) {
        for (int i = x; i <= z; i++, z--) {
            int temp = baskets[i];
            baskets[i] = baskets[z];
            baskets[z] = temp;
        }
    }

    /* 인덱스0 번째는 빈값으로 첫번쨰 부터 마지막 까지 공백과 함께 빌드 후 프린트 */
    static void printBasketNumber(int[] list) {
        for (int i = 1; i < list.length; i++) {
            sb.append(list[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

}
