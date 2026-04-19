/*
Constructor:
-> Its look like method it-self,
-> Same name as Class name,
-> no return type,
*/
class Humann {
  private int age;
  private String name;

  public Humann() { // Default Constructor
    age = 34;
    name = "John";
  }

  public Humann(int age, String name) { // Parameterized Constructor
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class Constructors {
  public static void main(String[] args) {
    Humann humann = new Humann();
    Humann humann1 = new Humann(24, "Aman");
    System.out.println(humann.getName() + " : " + humann.getAge());
    System.out.println(humann1.getName() + " : " + humann1.getAge());
  }
}
