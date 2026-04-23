/*
class - class -> extends
class - interface -> implements
interface - interface -> extends
*/
interface A {
  // by default final and static variable
  int age = 45;
  String city = "Ranchi";

  // by default every method public abstract
  void show();

  void config();
}
interface X{
  void run();
}
interface Y extends X{

}

class B implements A,Y {
  public void show() {
    System.out.println("In B Show");
  }

  public void config() {
    System.out.println("In B Config");
  }
  public void run(){
    System.out.println("In B Run");
  }
}

public class Interfaces {
  public static void main(String[] args) {
    A obj = new B();
    obj.show();
    obj.config();

    B obj1 = new B();
    obj1.run();
  }
}
