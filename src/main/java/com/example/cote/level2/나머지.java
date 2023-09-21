package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {
    public static void main(String[] args) throws IOException {
        int[] x = new int[10];
        int check;
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(br.readLine()) % 42;
        }
        for (int i = 0; i < x.length; i++) {
            check = 0;
            for (int j = i+1; j < x.length; j++) {
                if ((x[i] == x[j])) {
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
