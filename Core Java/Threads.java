/*
Thread: It is the smallest unit which we can work with 
*/

class A extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(8);
      } catch (InterruptedException e) {
      }
    }
  }
}

class B extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(7);
      } catch (InterruptedException e) {
      }
    }
  }
}

public class Threads {
  public static void main(String[] args) {

    A a = new A();
    B b = new B();
    a.start();
    try {
      Thread.sleep(50);
    } catch (InterruptedException e) {
    }
    b.start();

  }
}
