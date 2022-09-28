// When a class Inheritics another class it is called Single Inheritance
class Animal{
  public void eat(){
  System.out.println("I can Eat");
  }
}
class Dog extends Animal{
  public void bark(){
    System.out.println("I Can Bark");
  }
}
class SingleInhertance{
  public static void main(String[]args){
    Dog d = new Dog();
    d.eat();
    d.bark();
  }
}