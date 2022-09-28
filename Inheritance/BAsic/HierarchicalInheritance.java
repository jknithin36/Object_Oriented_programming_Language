//when two or more clasess inherits a single class

class Animal{
  public void eat(){
    System.out.println("I can eat");
  }

}
class Dog extends Animal{
  public void bark(){
    System.out.println("I Can Bark");
  }
}
class Cat extends Animal{
  public void meow(){
    System.out.println("I can Sound Meow");
  }
}

public class HierarchicalInheritance{
  public static void main(String[]args){
    Cat c = new Cat();
    c.meow();
    c.eat();
    Dog d = new Dog();
    d.eat();d.bark();

  }
}