/*
Type Conversion and Casting
doing explicit conversion is casting ( int b=(byte)a  )
doing implicit conversion is Conversion ( int a = b )

-> can't store Char in Boolean

*/
public class TypeConversionAndCasting {
  public static void main(String[] args) {
    byte b = 127;
    int a = 12;
    // b = a; XXXXX
    b = (byte) a; // Casting (Explicit Conversion)
    a = b; // Conversion (Implicit)

    int c = 259;
    byte k = (byte) c; // perform Modulus operation and store
    System.out.println(k);

    float f = 5.6f;
    int x = (int) f; // lossy conversion (x = 5 , loss of .6)
    System.out.println(x);

    /*--------Type Promotion----------- */

    byte j = 6;
    byte m = 2;
    int jm = j * m;
    // byte*byte=byte but java have features to promote data type
    System.out.println(jm);

  }
}
