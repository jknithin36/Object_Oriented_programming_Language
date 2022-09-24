class Circle{
  public double radius;
  public double area(){
    return Math.PI * radius *radius;
  }
  public double perimeter(){
    return 2*Math.PI*radius;
  }
  public double circumference(){
    return perimeter();
  }
}

public class Main{
  public static void main(String[]args){
    Circle c1 = new Circle();
    c1.radius = 7;
    System.out.println(c1.area());
    System.out.println(c1.perimeter());
    System.out.println(c1.circumference());

    System.out.println();
    Circle c2 = new Circle();
    c2.radius = 14;
    System.out.println(c2.area());
    System.out.println(c2.perimeter());
    System.out.println(c2.circumference());
  }
}