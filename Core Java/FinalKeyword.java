/*
Final : variable, method, class.
1. Final Variables
-> When a variable is declared as final, its value cannot be changed once it has been initialized. It essentially becomes a constant. 
2. Final Methods
-> A method declared as final cannot be overridden by any subclass.
3. Final Classes
->A class declared as final cannot be inherited or extended by another class. 
*/
class Calc{
  public final void show(){
    System.out.println("By Vishal");
  }
  public void add(int a, int b){
    System.out.println(a+b);
  }
}
class AdvCals extends Calc{
  // public void show(){} // can't override final method
}
public class FinalKeyword {
  public static void main(String[] args) {
    
  }
}
