import javax.swing.text.html.StyleSheet;

class Cylinder{
  public double radius;
  public double height;

  public double lidArea(){
 return Math.PI*radius*radius;
  }
  public double totalSurfaceArea(){
return 2*lidArea()+circumference()*height;
  }
  public double volume(){
   return lidArea()*height;
  }
  public double circumference(){
  return 2*Math.PI*radius;
  }
}
class Main{
  public static void main(String[]args){
    Cylinder c1 = new Cylinder();
    c1.height=10;
    c1.radius=7;
    System.out.println(c1.lidArea());
    System.out.println(c1.totalSurfaceArea());
    System.out.println(c1.volume());
    System.out.println(c1.circumference());
  }
}