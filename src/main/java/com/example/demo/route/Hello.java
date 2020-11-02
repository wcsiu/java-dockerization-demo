package com.example.demo.route;

import com.example.demo.logic.Time;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author wcsiu */
@RestController
public class Hello {
  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    String dateStr = Time.getNow();
    return String.format("Hello %s at %s!", name, dateStr);
  }
}
