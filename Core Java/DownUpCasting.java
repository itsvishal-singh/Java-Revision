class A {
  public void show() {
    System.out.println("In A show");
  }
}

class B extends A {
  public void show1() {
    System.out.println("In B show");
  }
}

public class DownUpCasting {
  public static void main(String[] args) {
    // Type Casting
    
    double d = 4.9;
    int i = (int) d;
    System.out.println(i);

    // A obj = new B(); // Also following object is same
    A obj = (A) new B(); // Up Casting (It is normal, no need to do (Implicitly done))

    obj.show();

    B obj1 = (B) obj; // Down Casting
    obj1.show1();
  }
}
