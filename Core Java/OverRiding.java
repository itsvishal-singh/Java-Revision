class A {
  int add(int a, int b) {
    return a + b;
  }
}

class B extends A {
  @Override // can/can't be add anotations 
  int add(int a, int b) { // add() overriden
    return a + b + 2;
  }
}

public class OverRiding {
  public static void main(String[] args) {
    B b = new B();
    int bb = b.add(4, 5);
    System.out.println(bb);
  }
}
