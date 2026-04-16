/*
Conditional Statements : 
 1. if(),
 2. if(), else,
 3. if(), else if(), else, --------(Nested )
 4. Ternary Operator,
*/
public class ConditionalStatement {
  public static void main(String[] args) {

    if (true)
      System.out.println("Execute only true condition");

    int a = 8;
    int b = 6;
    int c = 9;
    if (a > b && a < c)
      System.out.println(a + " is greater then " + b + " and Smaller then " + c);
    else
      System.out.println("Check nested output");

    System.out.println("---Nested----- ");
    if (a > b && a > c)
      System.out.println(a + " is greater");
    else if (b > c)
      System.out.println(b + " is greater");
    else
      System.out.println(c + " is greater");

    System.out.println("---Ternary Operator---");
    int result = 0;
    if (a % 2 == 0) {
      result += 20;
      System.out.println(result);
    } else {
      result += 10;
      System.out.println(result);
    }
    // work as above code is working
    result = a % 2 == 0 ? 20 : 10;
    System.out.println(result);

  }
}
