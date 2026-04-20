/*

 */
class A {
  A() {
    System.out.println("Object Created");
  }

  public void show() {
    System.out.println("In A Show");
  }
}

public class Objects {
  public static void main(String[] args) {
    new A(); // anonymus object
    new A().show();
  }
}
