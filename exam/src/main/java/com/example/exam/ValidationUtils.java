package com.example.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidationUtils {
    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        try {
            format.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

