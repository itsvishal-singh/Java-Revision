final class A { // Can't be inherit

}

sealed class B extends Thread implements Cloneable permits C, D {
  // Sealed Classes must be subclass
  // permit classes must be sealed or non-sealed or final
  // permits classes should be extended by subclasses
  // sealed class can extends and implements any other class
}

final class C extends B {

}

non-sealed class D extends B {

}

class E extends D{
  // can't inherit Sealed class without permits
  // non-sealed class can be inherit 
}

sealed  interface X permits Y{

}
non-sealed interface Y extends X{ // Interface can't be final so
 // extending sealed class should be sealed or non-sealed 
 // if sealed should be interface(s)
}
public class SealedClasses {
  public static void main(String[] args) {

  }
}
