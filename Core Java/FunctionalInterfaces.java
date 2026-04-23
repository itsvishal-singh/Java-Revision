@FunctionalInterface
interface A {
  // void show(int i, int j);
  // void show(int i);
  int add(int i, int j);
}

public class FunctionalInterfaces {
  public static void main(String[] args) {
    /*
     * A obj = new A() {
     * public void show(int i){
     * System.out.println("In Show");
     * }
     * };
     */

    // Lambda Expression

    // A obj = (int i, int j) -> System.out.println("In show, i & j : " + i + " & "
    // + j);
    // A obj = (i,j) -> System.out.println("In show, i & j : " + i + " & " + j);
    // A obj = i -> System.out.println("In show, i : " + i);
    // obj.show(5,6);
    // obj.show(5);

    // A obj = new A() {
    // public int add(int i, int j) {
    // return i+j;
    // }
    // };
    // int result = obj.add(5, 7);
    // System.out.println(result);

    A obj = (int i, int j) -> i + j; 
    int result = obj.add(5, 7);
    System.out.println(result);

  }
}
