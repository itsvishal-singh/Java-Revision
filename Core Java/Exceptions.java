/*
Exceptions:
Error-
1. Compile time error
2. Runtime error (Exceptions)
3. Logical error
*/

public class Exceptions {
  public static void main(String[] args) {
    int i = 2;
    int j = 0;
    int array[] = new int[5];
    String string = null;

    try {
      j = 18 / i;
      System.out.println(array[5]);
      System.out.println(string.length());
    } catch (ArithmeticException ae) {
      System.out.println(ae);
    } catch (ArrayIndexOutOfBoundsException ai) {
      System.out.println(ai);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Value of j = " + j);
    System.out.println("Bye");
  }
}
