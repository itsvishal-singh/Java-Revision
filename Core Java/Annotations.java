/*
Annotations:(Meta Data)
-> Suppliments to the compiler order to the run time
*/
class A{
  public void showTheData(){
    System.out.println("In A Show");
  }
}
class B extends  A{
  @Override // Annotation
  public void showTheData(){
    System.out.println("In B Show");
  }
}
public class Annotations {
  public static void main(String[] args) {
      B b = new B();
      b.showTheData();
  }
}
