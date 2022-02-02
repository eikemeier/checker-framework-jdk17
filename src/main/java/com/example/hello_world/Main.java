package com.example.hello_world;

public final class Main {
  private Main() {}

  public static void main(String... args) {
    var greeting = new Greeting(args.length > 0 ? args[0] : null);
    System.out.printf("Hello, %s!%n", greeting);
  }
}
