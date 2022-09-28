//When there is a chain of Inheritance


class Animal{
  public void eat(){
    System.out.println("I can Eat");
  }
}
class Dog extends Animal{
  public void bark(){
    System.out.println("I can Bark");
  }
}
class BabyDog extends Dog{
  public void weep(){
    System.out.println("I can Weep");
  }
}
public class MultiLevelInheritance {
  public static void main(String[]args){
  BabyDog d = new BabyDog();
  d.eat();
  d.bark();
  d.weep();
  }
}
