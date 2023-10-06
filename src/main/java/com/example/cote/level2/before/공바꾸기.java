package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공바꾸기 {
    /*
     * basketQuantity = 바구니 수
     * changeQuantity = 바꿀 횟 수
     * x = 변경 할 바구니 1
     * y = 변경 할 바구니 2
     * list = 공이들어 있는 바구니
     */
    static int basketQuantity, changeQuantity, x, y;
    static int[] list;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        basketQuantity = Integer.parseInt(st.nextToken());
        changeQuantity = Integer.parseInt(st.nextToken());
        list = new int[basketQuantity + 1];
        /* 최초값 넣기 */
        for (int i = 1; i < list.length; i++) {
            list[i] = i;
        }
        /* 바구니 속 공 섞기 */
        for (int i = 0; i < changeQuantity; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            list[0] = list[x];
            list[x] = list[y];
            list[y] = list[0];
        }
        /* 값 사이 " " 공백 추가하여 StringBuilder에 각 value 삽입 */
        for (int i = 1; i < list.length; i++) {
            sb.append(list[i]).append(" ");
        }
        /* 프린트 */
        System.out.println(sb.toString());
    }
}
