interface Test{
  void method();
  void method2();
}

class My implements Test{
  public void method(){
    System.out.println("Meth1 of class My");
  }
  public void method2(){
    System.out.println("Meth2 of my class");
  }
  public void three(){
    System.out.println("Three");
  }
}

public class Ex1{
  public static void main(String[]args){
    Test t = new My();
    t.method();
    t.method2();
  }
}