/*
Immutable-(any change creates a new object in memory rather than modifying the original.)
-> String: String is a built-in object that represents a sequence of characters. It is not a primitive data type (like int or char),

Mutable- (Mutable strings in Java are string objects whose content can be changed after creation.)
-> StringBuffer: makes strings growable and writable, can either have characters or substrings inserted in the middle or appended to the end, Thread-safe with synchronized methods, 	Use when thread safety is required.
-> StringBuilder: The function of StringBuilder is also much similar to the StringBuffer class, Not thread-safe; no synchronization, Use when thread safety is not a concern.
*/
public class Strings {
  public static void main(String[] args) {
    String string = "Hello";
    String string1 = new String("Hello");
    System.out.println(string + " " + string1);
    System.out.println(string.equals(string1));// true (Checks value)
    System.out.println(string == string1); // false (Checks reference)

    string.concat("world"); // Immutable: Original string remains unchanged.
    System.out.println(string);

    // Mutable
    StringBuffer stringBuffer = new StringBuffer("Hiii");
    stringBuffer.append(" Vishal"); // Mutable: Original string will changed.
    System.out.println(stringBuffer);

    StringBuilder stringBuilder = new StringBuilder("Learning ");
    stringBuilder.append("String");
    System.out.println(stringBuilder);

    // Conversion from StringBuffer to StringBuilder
    String str = stringBuffer.toString();
    StringBuilder sbl = new StringBuilder(str);
    System.out.println(sbl);

    // Conversion from StringBuilder to StringBuffer
    String strr = stringBuilder.toString();
    StringBuffer sbr = new StringBuffer(strr);
    System.out.println(sbr);

    // inserting String 
    sbr.insert(9, "Java ");
    System.out.println(sbr);
  }
}
