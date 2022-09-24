class Circle{
  private double radius;
  
  public Circle(double rad){
  this.radius = rad;
  }
  public void setRadius(double rad){
    radius = rad;
  }
  public double getRadius(){
    return radius;
  }
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
    Circle c1 = new Circle(2);
    
    System.out.println(c1.area());
    System.out.println(c1.perimeter());
    System.out.println(c1.circumference());
  
  }
}