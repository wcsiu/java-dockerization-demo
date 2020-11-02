package com.example.demo.test.logic;

import com.example.demo.logic.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeTests {
  @Test
  void getNow() {
    String dateStr = Time.getNow();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String expectedDateString = format.format(date);
    Assertions.assertEquals(expectedDateString, dateStr);
  }
}
