package com.example.cote.level2.직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼각형외우기 {
    static int x, y, z;
    static String error = "Error";
    static String equilateral = "Equilateral";
    static String isosceles = "Isosceles";
    static String scalene = "Scalene";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        z = Integer.parseInt(br.readLine());
        if (x + y + z == 180) {
            if (x == y && x == z && y == z) System.out.println(equilateral);
            else if (x == y || x == z || y == z) System.out.println(isosceles);
            else System.out.println(scalene);
        } else System.out.println(error);
    }
}
