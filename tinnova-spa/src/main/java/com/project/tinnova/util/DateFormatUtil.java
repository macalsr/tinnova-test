package com.project.tinnova.util;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

    public static Date stringToDate(String date) {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        date = DateFor.format(date);
        try {
            return DateFor.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String dateToString(Date date) {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        return DateFor.format(date);
    }
}
