package com.liukai.toto.web;


import java.util.Scanner;

/**
 * Created by liukai on 2017/5/1.
 */
public class ToDoApp {


  public static void main(String[] args){
    System.out.println("Hello It's my first Gradle project oh yel!");

    Scanner scanner = new Scanner(System.in);

    while(scanner.hasNext()){
      System.out.println(scanner.next());
    }

  }
}
