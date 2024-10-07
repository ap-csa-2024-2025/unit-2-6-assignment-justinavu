import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // p1
    double pi = 3.14159265359;
    System.out.println("Radius of circle:");
    double rad = sc.nextDouble();
    Circle c1 = new Circle(rad);
    double circum = 2*rad*pi;
    double area = 2*rad*rad;
    System.out.println(c1.toString() + " has a circumference of " + circum + "and area of " + area);

    System.out.println("num of side:");
    int sides = sc.nextInt();
    System.out.println("side len");
    double sLen = sc.nextDouble();
    RegularPolygon rp = new RegularPolygon(sides, sLen);
    System.out.println("Area with " + rp.getNumSides() + " sides: " + rp.getArea());
		rp.addSides(2);
		System.out.println("incrementing sides by 2...");
		System.out.println("Area with " + rp.getNumSides() + " sides: " + rp.getArea());
  }
}
