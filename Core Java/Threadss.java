public class Threadss {
  public static void main(String[] args) {

    Runnable a = () -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Runnable b = () -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hi");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);
    t1.start();
    t2.start();

  }
}
