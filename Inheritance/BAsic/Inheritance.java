/*
 * Inheritance Means Acquiring Properties of class To anothrr class
 */
class Employee{
  float salary = 40000;
}
class Programmer extends Employee{
  int bonus =10000;
}

public class Inheritance{
public static void main(String[]args){
  Programmer p = new Programmer();
  System.out.println(p.salary);
  System.out.println(p.bonus);
}
}