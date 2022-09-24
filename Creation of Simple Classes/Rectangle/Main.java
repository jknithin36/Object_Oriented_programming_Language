class Rectangle{
public double length;
public double breadth;

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
    Rectangle r1 = new Rectangle();
    r1.length = 2;
    r1.breadth=2;
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    System.out.println(r1.isSquare());
    System.out.println();
    Rectangle r2 = new Rectangle();
    r2.length = 5;
    r2.breadth=10;
    System.out.println(r2.area());
    System.out.println(r2.perimeter());
    System.out.println(r2.isSquare());
  }
}