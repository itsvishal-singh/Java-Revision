
import java.util.Objects;

// class Alien{
//   private final int id;
//   private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//       return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         int hash = 7;
//         hash = 47 * hash + this.id;
//         hash = 47 * hash + Objects.hashCode(this.name);
//         return hash;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }
//         if (obj == null) {
//             return false;
//         }
//         if (getClass() != obj.getClass()) {
//             return false;
//         }
//         final Alien other = (Alien) obj;
//         if (this.id != other.id) {
//             return false;
//         }
//         return Objects.equals(this.name, other.name);
//     }
// }

record Alien(int id, String name) {
  // Canonical Record constructor
  // by default all variable private and final
  // you can implement interface
  // you can write multiple methods
  static int age; // correct
  // int age1; // can't initialize instance variable
  // because we are declaring in constructor {Alien(int id, String name)}

  public Alien() {
    this(0, "");
  }

  // public Alien(int id, String name) { // this constructor is already there so
  // no need to declare
  // if(id==0)
  // throw new IllegalArgumentException("id can't be zero");
  // this.id = id;
  // this.name = name;
  // }
  public Alien { // Compact Canonical Constructor
    if (id == 0)
      throw new IllegalArgumentException("id can't be zero");
  }

}

public class RecordClasses {
  public static void main(String[] args) {
    Alien a1 = new Alien(1, "VISHAL");
    Alien a2 = new Alien(1, "VISHAL");
    // Alien a3 = new Alien(); // can't use default constructor
    // Alien a4 = new Alien(0,"Aman");
    System.out.println(a1.name());
    System.out.println(a1.equals(a2));
    System.out.println(a1);
    // System.out.println(a3);

  }
}
