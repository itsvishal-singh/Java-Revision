/*
LVTI : 
-> Local Variable Type Inference
-> var keyword is used
-> only valid in local variable not on global
-> work with static not dynamic.
*/
class Alien{
  
}
public class LVTI {
  // var num = 10;  // error
  public static void main(String[] args) {
    int a = 9;
    var b = 8;
    String var = "Navin";
    int num[] = new int[10];
    // var num1[] = new int[10]; // error
    var nums = new int[10];
    var obj = new Alien();
  }
}
