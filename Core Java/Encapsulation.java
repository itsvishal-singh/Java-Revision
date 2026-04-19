/*
Encapsulation:
-> bundles data (variables) and the methods (functions) that act on that data into a single unit, usually a class, 
-> Encapsulation is about hiding data to protect it

This: this is the keyword which represent the current object
*/
class Human{
  private int age;
  private String name;

  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age=age;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
   
}
public class Encapsulation {
  public static void main(String[] args) {
      Human human = new Human();
      human.setAge(45);
      human.setName("Ram");
      System.out.println(human.getName()+" : "+human.getAge());
  }
}
