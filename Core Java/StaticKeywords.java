/*
Static Keyword:
-> Static Variables (Class Variables):
When a variable is declared as static, a single copy of it is created and shared among all instances of the class.
-> static Methods:
A static method belongs to the class and can be invoked without creating an instance of that class.  Static methods cannot access non-static (instance) variables or methods directly because they don't have a this reference. They can only access other static data
->Static Blocks
A static block is a group of statements used to initialize static variables.   
*/
class Mobile {
  String brand;
  int price;
  // String name;
  static String name;

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile mobile){
    System.out.println(mobile.brand + " : " + mobile.price + " : " + name);
  }

  public Mobile(){
    brand = "";
    price = 200;
    System.out.println("In Constructor");

  }
  static{
    name ="Phone";
    System.out.println("In Static Block");
  }
}

public class StaticKeywords {
  public static void main(String[] args) throws ClassNotFoundException {
    // Mobile mobile = new Mobile();
    // mobile.brand = "Apple";
    // mobile.price = 1500;
    // // mobile.name = "Smartphone";
    // Mobile.name = "Smartphone";

    // Mobile mobilee = new Mobile();
    // mobilee.brand = "Samsung";
    // mobilee.price = 1400;
    // // mobilee.name = "Smartphone";

    // mobile.show();
    // mobilee.show();

    Class.forName("Mobile");
  }
}
