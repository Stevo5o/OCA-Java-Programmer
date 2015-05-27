package com.ocajexam.tutorial;

import com.ocajexam.tutorial.planets.Earth;
import com.ocajexam.tutorial.planets.Mars;
import com.ocajexam.tutorial.planets.Venus;

public class GreetingsUniverse {

  public static void main(String[] args) {
    System.out.println("Greetings, Universe!");

    Earth e = new Earth();
    Mars m = new Mars();
    Venus v = new Venus();
  }
}
