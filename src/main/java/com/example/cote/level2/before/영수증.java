package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 영수증 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int totalPrice = Integer.parseInt(br.readLine());
        int itemTypes = Integer.parseInt(br.readLine());

        for (int i = 0; i < itemTypes; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            result += x * y;
        }
        if (totalPrice == result) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}