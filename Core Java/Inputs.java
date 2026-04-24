
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter a number");
    // int num = System.in.read(); // it return ASCII Values and for single character or numbers etc.

    // InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReader br = new BufferedReader(isr); // Buffer Reader can take input from anywhare not only from keyboard (From File, Network etc). 
    // Buffer Reader is a Resource.
    // int num = Integer.parseInt(br.readLine());

    Scanner sc = new Scanner(System.in); // Latest Input class.
    int num = sc.nextInt();
    System.out.println(num);
    // br.close();
  }
}
