package com.liukai.toto.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liukai
 * @date 2017/5/26
 */
@Controller
@SpringBootApplication
public class MyBootApp {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "hello my boot!";
  }

  public static void main(String[] args) {
    SpringApplication.run(MyBootApp.class, args);
  }
}
