package com.example.cote.level2.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위세개 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);

            int a, b, c, result;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a == b && a == c && b == c) {
                result = 10000 + (a * 1000);
                System.out.println(result);
            }else if(a == b || a == c) {
                result = 1000 + (a * 100);
                System.out.println(result);
            }else if (b == c) {
                result = 1000 + (b * 100);
                System.out.println(result);
            }else {
                result = Math.max(a, Math.max(b, c)) * 100;
                System.out.println(result);
            }
        }
    }
}
