

class Cylinder{
  private double radius;
  private double height;
  public Cylinder(double radius, double height){
    setRadius(radius);
    setHeight(height);
  }
  public Cylinder(){
    radius=1;
    height=1;
  }
  
  public void setRadius(double rad){
    if(rad>=0){
    radius = rad;
    }else{
      height =0;
    }
  }
  public void setHeight(double h){
    if(h >=0){
    height = h;
  }else{
height =0;
  }
}
public void setDiamensions(int h,int r){
height=h;
 radius = r;
}
  public double getRadius(){
    return radius;
  }
  public double getHeight(){
    return height;
  }

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
    Cylinder c1 = new Cylinder(1,2);
    
    System.out.println(c1.lidArea());
    System.out.println(c1.totalSurfaceArea());
    System.out.println(c1.volume());
    System.out.println(c1.circumference());
  }
}