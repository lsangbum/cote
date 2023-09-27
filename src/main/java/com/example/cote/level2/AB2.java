package com.example.cote.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AB2 {
    static int x, y, res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        res = x + y;
        System.out.println(res);
    }
}
