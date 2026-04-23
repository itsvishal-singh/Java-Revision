enum Status {
  Running, Failed, Pending, Success; // Named Constant
}

public class Enumeration {
  public static void main(String[] args) {

    Status s = Status.Failed;

    System.out.println(s + " : " + s.ordinal());

    System.out.println(s.getClass().getSuperclass());

    Status[] ss = Status.values();
    // System.out.println(ss[2]);

    for (Status sss : ss) {
      System.out.println(sss + " : " + sss.ordinal());
    }

    /*
     * if (s == Status.Running)
     * System.out.println("All Good");
     * else if(s == Status.Failed)
     * System.out.println("Try Again");
     * else if(s == Status.Pending)
     * System.out.println("Please Wait");
     * else
     * System.out.println("Done");
     * 
     */
    /*
     * switch (s) {
     * case Running:
     * System.out.println("All Good");
     * break;
     * case Failed:
     * System.out.println("Try Again");
     * break;
     * case Pending:
     * System.out.println("Please Wait");
     * break;
     * default:
     * System.out.println("Done");
     * break;
     * }
     */
    switch (s) {
      case Running -> System.out.println("All Good");
      case Failed -> System.out.println("Try Again");
      case Pending -> System.out.println("Please Wait");
      default -> System.out.println("Done");
    }


  }
}
