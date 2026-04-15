/*
Literals : Any constant value that can be assigned to the variable is called a literal.
Types :
1. Integral : Binary, Octal, Decimal, Hexadecimal
2. Floating-Point : Decimal, Hexadecimal (Octal floating-point literals ars not Supported)
3. Char : Single Quote, char as integer, Unicode Represemtation, Escape Sequence
4. String : Any sequence of characters within double quotes is treated as String literals. 
5. Boolean : true/false

*/
public class Literals {
  public static void main(String[] args) {
    // decimal-form literal
    int a = 101;
    // octal-form literal
    int b = 0100;
    // Hexa-decimal form literal
    int c = 0xFace;
    // Binary literal
    int d = 0b1111;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    // decimal-form literal (float type suffix 'f' or 'F' is required)
    float e = 101.230f;

    // It is a decimal literal despite the leading zero
    float f = 0123.222f;

    // Hexadecimal floating-point literals ARE supported in Java (since Java 5).
    // They use 'p' or 'P' to specify the binary exponent.

    double g = 0x1.8p3; // 1.8 (hex) × 2^3 = 12.0

    System.out.println(e);
    System.out.println(f);
    System.out.println(g);

    // single character literal within single quotes
    char ch = 'a';

    // invalid octal literal (causes compilation error)
    // char b = 0789;

    // Unicode representation
    char h = '\u0062';

    System.out.println(ch);

    // commented out due to error
    // System.out.println(b);

    System.out.println(h);

    // Escape character literal
    System.out.println("\"  is a symbol");

    String s = "Hello";

    // Without double quotes, it is treated as a variable and causes a compiler
    // error
    // String s1 = Hello;

    System.out.println(s);

    // commented out due to error
    // System.out.println(s1);

    boolean x = true;
    boolean y = false;

    // The following lines cause compilation
    // errors and are commented out

    // boolean t = 0;
    // boolean r = 1;

    System.out.println(x);
    System.out.println(y);

    // System.out.println(t);
    // System.out.println(r);
  }
}
