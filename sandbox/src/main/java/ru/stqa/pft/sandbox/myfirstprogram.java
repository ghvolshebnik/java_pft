package ru.stqa.pft.sandbox;

public class myfirstprogram {
  public static void main(String[] args) {
    hello("World");
    hello("Artem!");

    double l = 5;
    System.out.println("Ploschad' kvadrata so storonoy " + l + " = " + area(l));

    double a = 5;
    double b = 7;
    System.out.println("Ploschad' pryamougolnika so storonami " + a + " i " + b + " = " + area(a,b));
  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area (double len) {
    return len*len;
  }

  public static double area(double a, double b) {
    return a*b;
  }
}