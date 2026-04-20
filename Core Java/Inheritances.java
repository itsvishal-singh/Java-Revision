/*
Inheritance: Allows one class to acquire the properties (fields) and behaviors (methods) of another class. It promotes code reusability and establishes a natural hierarchy between objects.
 -> IS-A : Based on Inheritance.(A Car IS-A Vehicle.)
 -> HAS-A : Based on composition.(A Car HAS-A Engine)
 -> Parent/Super/Base class : The existing class from which other classes inherit features. In Java, the Object class is the ultimate parent of all classes.
 -> Child/Sub/Derived class: The new class that inherits features from the parent. It can also add its own unique fields and methods.
 -> extends Keywords: Used to establish an inheritance relationship.
*/
public class Inheritances {
  public static void main(String[] args) {
    VeryAdCalc veryAdCalc = new VeryAdCalc();
    int a = veryAdCalc.add(4, 6);
    int s = veryAdCalc.sub(14, 6);
    int m = veryAdCalc.mul(4, 6);
    int d = veryAdCalc.div(24, 6);
    double p = veryAdCalc.power(2, 3);

    System.out.println(a);
    System.out.println(s);
    System.out.println(m);
    System.out.println(d);
    System.out.println(p);
  }
}
