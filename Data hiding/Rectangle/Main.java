class Rectangle{
private double length;
private double breadth;

public Rectangle(){
  this.length = 1;
  this.breadth = 1;
}

public Rectangle(double length, double breadth){
  setLength(length);
  setBreadth(breadth);
}

public Rectangle(double s){
  length = breadth = s ;
}

public double getLength(){
  return length;
}

public double getBreadth(){
  return breadth;
}

public void setLength(double l){
  if(l>=0){
  l = length;
  }else{
    length=0;
  }
}

public void setBreadth(double b){
  if(b>=0){
  b = breadth;
  }else{
    breadth =0;
  }
}

public double area(){
return length*breadth;
}
public double perimeter(){
return 2*(length+breadth);
}
public boolean isSquare(){
if(length==breadth){
  return true;
}else{
  return false;
}
}
}

public class Main{
  public static void main(String[]args){
   Rectangle r1 = new Rectangle(10,5);
   System.out.println(r1.area());
  }
}