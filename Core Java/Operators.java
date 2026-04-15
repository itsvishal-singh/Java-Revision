/*
Operators :
1. Arithmetic Operator : +, -, *, /, %, ++, --
2. Relatioinal Operator : >, <, ==, !=, <=, >= 
3. Logical operator : && (AND 'all true'), || (OR 'any of one true'), ! (NOT 'reverse'),  
*/
public class Operators {
  public static void main(String[] args) {

    /*-------Arithmetic Operator---- */
    System.out.println("---Arithmetic Operator------");
    int a = 20;
    int b = 5;
    int sum = a + b;
    int sub = a - b;
    int mul = a * b;
    int div = a / b;
    int mod = a % b;
    System.out.println(sum);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(div);
    System.out.println(mod);

    // a = a + 1;
    // a += 1;
    // a++; // Post-Increment
    // ++a; // Pre-Increment
    // a--; // post-decrement

    int result = a++;
    System.out.println(result);
    System.out.println(a);

    /*---Relatioinal Operator------ */

    System.out.println("---Relatioinal Operator------");
    System.out.println(a < b);
    System.out.println(a > b);
    System.out.println(a <= b);
    System.out.println(a >= b);
    System.out.println(a != b);
    System.out.println(a == b);

    /*---Logical Operator------ */

    System.out.println("---Logical Operator------");

    int x = 20;
    int y = 10;
    System.out.println(a > b && x > y);
    System.out.println(a > b && x < y);
    System.out.println(a > b || x > y);
    System.out.println(a < b || x > y);
    boolean bool = x > y;
    System.out.println(!bool);
  }
}
