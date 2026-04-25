
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student> {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Student{");
    sb.append("age=").append(age);
    sb.append(", name=").append(name);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public int compareTo(Student that) {
    if (this.age > that.age)
      return 1;
    else
      return -1;

  }

}

public class Sortings {
  public static void main(String[] args) {

    // Comparator<Integer> comparator = new Comparator<>() {
    // public int compare(Integer i, Integer j) {
    // if (i % 10 > j % 10)
    // return 1;
    // else
    // return -1;
    // }
    // };

    // Lambda expression for above logic
    Comparator<Integer> comparator = (i, j) -> i%10>j%10 ?1:-1;
      

    

    List<Integer> nums = new ArrayList<Integer>();
    nums.add(14);
    nums.add(23);
    nums.add(52);
    nums.add(10);

    Collections.sort(nums, comparator);
    System.out.println(nums);

    // Comparator<Student> com = new Comparator<>() {
    // public int compare(Student i, Student j) {
    // if (i.age > j.age)
    // return 1;
    // else
    // return -1;
    // }
    // };

    List<Student> students = new ArrayList<>();
    students.add(new Student(23, "Vishal"));
    students.add(new Student(25, "Rahul"));
    students.add(new Student(24, "Navin"));
    students.add(new Student(13, "Raju"));
    // System.out.println(students);
    Collections.sort(students);
    for (Student studs : students)
      System.out.println(studs);
  }
}
