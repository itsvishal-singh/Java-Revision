/*
Object Oriented Programming
Object :  An instance of a class, representing a real-world entity. Properties and Behaviours (JVM Create Object by taking blueprint from Class file)
Class : A blueprint or template for creating objects, defining their structure and behavior. Having Methods, variables
*/

class Calculator {
  public int add(int a, int b) {
    System.out.println("In add Mothod");
    return a + b;
  }
}

public class OOP {
  public static void main(String[] args) {
    int x = 5;
    int y = 7;
    Calculator calculator = new Calculator();
    int result = calculator.add(x, y);
    System.out.println("Sum of given Numbers : " + result);
  }
}
