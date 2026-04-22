public class WrapperClass {
  public static void main(String[] args) {
    int num = 7;
    Integer num1 = num; // Auto-Boxing

    int num2 = num1;  // Auto-Unboxing
    System.out.println(num2);

    String str = "12";
    int num3 = Integer.parseInt(str);
    System.out.println(num3*2);

  }
}
