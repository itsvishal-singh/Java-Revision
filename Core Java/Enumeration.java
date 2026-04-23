enum Status{
  Running, Failed, Pending, Success; // Named Constant
}
public class Enumeration {
  public static void main(String[] args) {
    Status s = Status.Failed;
    System.out.println(s + " : " + s.ordinal());

    Status[] ss = Status.values();
    // System.out.println(ss[2]); 

    for(Status sss : ss){
      System.out.println(sss + " : " + sss.ordinal());
    }
  }
}
