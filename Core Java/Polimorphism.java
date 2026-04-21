/*
Polimorphism :
-> (Many Behaviour)
-> Types:-
-> 1. Compile Time (Early Binding):Behaviour Define at Compile time. (Overloading)
:- having two methods with same name but different parameters.
-> 2. Run Time (Late Binding): Behaviour Define at Run-Time. (Overriding)
:- Having Two methods with same name and same parameter.
*/
class A {
  public void show() {
    System.out.println("In A show");
  }
}

class B extends A {
  public void show() {
    System.out.println("In B show");
  }
}

class C extends B {
  public void show() {
    System.out.println("In C show");
  }
}

public class Polimorphism {
  public static void main(String[] args) {
    A obj = new A();
    obj.show();

    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
  }

}
