import java.util.List;
import java.util.Arrays;

public class MethodReference {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Vishal", "Laxmi", "Navin", "Kishor");
    List<String> uName = names.stream()
        .map(String::toUpperCase) //Method Reference
        .toList();

    // System.out.println(uName);
    // uName.forEach(i -> System.out.println(i));
    uName.forEach(System.out::println); // Method Reference
  }
}
