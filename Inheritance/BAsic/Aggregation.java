class Address{
  String city,state,country;
  public Address(String city,String state, String country){
    this.city=city;
    this.state=state;
    this.country=country;
  }
}

class Employee{
  String name;
  Address address;
  public Employee(String name,Address address){
    this.name=name;
    this.address=address;
  }
  public void display(){
    System.out.println(name);
    System.out.println(address.city+" "+address.state+" "+address.country);
  }
}
public class Aggregation {
  public static void main(String[]args){
  Address a = new Address("Gadwal", "Telangana", "India");
  Employee e = new Employee("Nithin", a);
  e.display();
  }
}
