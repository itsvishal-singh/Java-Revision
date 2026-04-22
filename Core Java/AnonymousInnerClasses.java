class A {
  public void show() {
    System.out.println("In A Show");
  }
}

public class AnonymousInnerClasses {
  public static void main(String[] args) {
    A obj = new A() { // Anonymous Inner Class
      public void show() {
        System.out.println("In New Show");
      }
    };
    obj.show();
  }
}
