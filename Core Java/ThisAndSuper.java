/*
This and Super method:
-> Purpose: this() targets same-class constructors; super() targets parent-class constructors.
-> Constraints: Both must be the first statement in a constructor, meaning they cannot coexist in the same one.
-> Automation: Only super() is inserted automatically by the compiler
 */
class A {
  public A() {
    super();
    System.out.println("In A");
  }

  public A(int n) {
    super(); 
    System.out.println("In A int");
  }
}

class B extends A {
  public B() {
    super();
    // super(9);
    System.out.println("In B");
  }

  public B(int n) {
    this();
    System.out.println("In B int");
  }
}

public class ThisAndSuper {
  public static void main(String[] args) {
    B b = new B(9);
  }
}
