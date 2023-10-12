package com.example.cote.level2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 오늘날짜 {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String res = simpleDateFormat.format(date);
        System.out.println(res);
    }
}
