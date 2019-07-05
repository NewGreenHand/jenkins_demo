package com.example.demo.web;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fei
 * @since 2019-06-28 15:00
 */
@Validated
@RestController
public class HelloController {

  @GetMapping("hello")
  public String hello() {
    return "Hello World";
  }
}
