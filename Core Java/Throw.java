class VishalException extends  RuntimeException{
  public VishalException(String string){
    super(string);
  }
}

public class Throw {
  public static void main(String[] args) {
    int i = 20;
    int j = 0;
    // try {
    //   j = 18 / i;
    //   if (j == 0)
    //     throw new ArithmeticException("I don't want to print Zero");
    // } catch (ArithmeticException e) {
    //   j = 18 / 1;
    //   System.out.println("Thats the Default Output");
    // } catch (Exception e) {
    //   System.out.println("Something went wrong.." + e);
    // }

      try {
      j = 18 / i;
      if (j == 0)
        throw new VishalException("I don't want to print Zero ");
    } catch (VishalException e) {
      j = 18 / 1;
      System.out.println("Thats the Default Output \n" + e);
    } catch (Exception e) {
      System.out.println("Something went wrong.. " + e);
    }
    System.out.println(j);
    System.out.println("Bye");
  }
}
