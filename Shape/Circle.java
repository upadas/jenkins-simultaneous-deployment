import java.lang.Math;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void id() {
    System.out.println("I am a circle");
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(4.2);
    System.out.println(
      "Area of the circle with radius " + circle.radius + " is " + circle.area()
    );
  }
}
