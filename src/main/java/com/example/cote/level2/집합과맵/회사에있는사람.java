package com.example.cote.level2.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        HashMap map = new HashMap();
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            map.put(st.nextToken(), st.nextToken());
        }

        String[] res = new String[map.size()];
        for (int i = 0; i < res.length; i++) {
            if (map.containsValue("enter")) {
                res[i] = String.valueOf(map.values());
            }
        }
        System.out.println(Arrays.toString(res));

    }

}
