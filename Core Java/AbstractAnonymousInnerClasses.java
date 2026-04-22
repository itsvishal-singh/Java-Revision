abstract class A{
  public abstract void show();
  public abstract void config();
}

public class AbstractAnonymousInnerClasses {
  public static void main(String[] args) {
      A obj = new A(){
        public void show() {
          System.out.println("In New show");
       }
       public void config() {
        System.out.println("In New config");
     }
      };
      obj.show();
      obj.config();
  }
}
