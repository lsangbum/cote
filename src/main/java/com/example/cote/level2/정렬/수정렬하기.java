package com.example.cote.level2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기 {
    /**
     * 입력받을 수 x
     * 줄 단위로 x개의 수들이 입력될 경우
     * 이를 오름차 순으로 한줄 당 하나 씩 출력하시오.
     */
    static int x;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 배열에 수 담기 */
        x = Integer.parseInt(br.readLine());
        arr = new int[x];
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(br.readLine());
        
        /* 오름차순 정렬 후 StringBuilder 에 담아 한번에 출력
        * 이 경우 반복적으로 프린트 메서드 사용할 경우 메모리 활용도가 떨어짐 */
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) sb.append(arr[i]).append("\n");
        
        System.out.println(sb.toString());
    }
}
