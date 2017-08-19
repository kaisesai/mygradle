package com.liukai.toto.web;

/**
 * Created by liukai on 2017/5/26.
 */
//@Controller
//@EnableAutoConfiguration
public class MyBootApp {

//  @RequestMapping("/")
//  @ResponseBody
  String home() {
    return "hello my boot!";
  }

  public static void main(String[] args) {
//    SpringApplication.run(MyBootApp.class, args);
  }
}
