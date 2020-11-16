package ru.stqa.pft.sandbox;

public class myfirstprogram {
  public static void main(String[] args) {
    Point p1 = new Point (1,1);
    Point p2 = new Point (1,10);
    System.out.println("rasstoyanie mezhdu tochkami = " + p1.distance(p2) + " sm");


    hello("World");
    hello("Artem!");

    Square s = new Square(5);
    System.out.println("Ploschad' kvadrata so storonoy " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(5,9);
    System.out.println("Ploschad' pryamougolnika so storonami " + r.a + " i " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}