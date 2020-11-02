package com.example.demo.logic;

import java.text.SimpleDateFormat;
import java.util.Date;

/** @author wcsiu */
public class Time {
  public static String getNow() {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String dateString = format.format(date);
    return dateString;
  }
}
