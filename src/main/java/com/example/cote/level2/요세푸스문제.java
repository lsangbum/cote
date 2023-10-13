package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제 {
    /**
     * 입력 받은 두수 x, y
     * 1 ~ x 까지 y씩 옮겨가며 삭제
     * 삭제 된 순서대로 출력양식에 따라 출력하시오.
     */
    static Queue<Integer> que = new LinkedList<>();
    static int x, y, temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < x; i++) que.add(i+1);   //큐에 1~x 까지 저장

        while (que.size() > 1) {    //마지막 한개가 남을 때까지 반복
            for (int i = 0; i < y - 1; i++) {   //y번째 값 전까지 뒤로 보내기 *poll()함수의 경우 먼저 저장된 값을 반환하고 큐에서 삭제
                temp = que.poll();
                que.add(temp);
            }
            temp = que.poll();  //y번째 값 삭제
            sb.append(temp).append(", ");   //삭제 된 값 저장
        }

        temp = que.poll();  //마지막 남은 값 삭제
        sb.append(temp).append(">");    //삭제 값 저장

        System.out.println(sb);
    }
}
