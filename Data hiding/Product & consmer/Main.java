class product{
  private String itemNo;
  private String name;
  private double price;
  private int qty;
  //Constructor
  public product(String itemNo, String name,double price,int qty){
    this.itemNo = itemNo;
    this.name=name;
    this.price=price;
    this.qty=qty;
  }
  //get methods
  public String getItem(){
    return itemNo;
  }
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQty(){
    return qty;
  }
  //setMethods
public void setPrice(double p){
 this.price=p;
}
public void setQty(int q){
 this.qty=q;
}
}
//Customer class
class Customer{
private String custID;
private String name;
private String address;
private String phoneNO;

public Customer(String custId,String name,String address,String phoneNo){
  this.custID = custId;
  this.name = name;
  this.address=address;
  this.phoneNO=phoneNo;
}
public void setAddress(String address){
  this.address=address;
}
public String getCust(){
  return custID;
}
public String getName(){
  return name;
}
public String getAddress(){
  return address;
}
public String getPhone(){
  return phoneNO;
}
}


public class Main{
public static void main(String[]args){
product p = new product("123","Choclate", 5, 25);
Customer c = new Customer("6029", "Nithin", "Gadwal", "6302167520");
c.setAddress("Hyderbad");
System.out.println(p.getItem());
System.out.println(c.getAddress());
}
}