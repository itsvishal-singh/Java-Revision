/*
Loops: (Repeat code of block or statement for specific number of times)
1. while
2. do while
3. for
*/

public class Loops {
  public static void main(String[] args) {
    System.out.println("*** While Loop *****");
    int i = 1;
    while (i <= 2) // accept true or false (condition)
    {
      System.out.println("Example of While Loop \nValue of i = " + i);
      i++;
    }
    System.out.println("i = " + i);

    System.out.println("----Nested While Loop------");

    int j = 1;
    while (j <= 3) {
      System.out.println("Example of While Loop \nValue of j = " + j);
      int k = 1;
      while (k <= 2) {
        System.out.println("Hello " + k);
        k++;
      }
      j++;
    }
    System.out.println("i = " + i + "\n");

    System.out.println("*** Do While Loop *****");

    int m = 4;
    do {
      System.out.println("Run one time without any condition");
      m++;
    } while (m <= 3); // false

    System.out.println("*** For Loop *****");
    for (int a = 0; a < 4; a++) {
      System.out.println("Hi " + a);
    }

    System.out.println("-----For reverse Order----");
    for (int x = 3; x >= 0; x--) {
      System.out.println("Hi " + x);
    }

    System.out.println("----Nested For Loop------");
    for (int s = 1; s <= 5; s++) {
      System.out.println("Day : " + s);
      for (int h = 1; h <= 9; h++) {
        System.out.println("  " + (h + 8) + " : " + (h + 9) + " : ________");
      }

    }

  }
}
