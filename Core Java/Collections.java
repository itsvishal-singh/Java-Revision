
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
-> The Collection Interface:- 
The java.util.Collection is the root interface of the hierarchy. It defines the basic operations that all groups of objects (except Maps) should support. 
Provide a standard way to represent a group of individual objects as a single unit.
Sub-interfaces: Key sub-interfaces include List (ordered, allows duplicates), Set (unordered, unique elements), and Queue (FIFO order).
Common Methods: Methods defined here include add(), remove(), size(), clear(), and iterator(). 

-> The Collections Utility Class:-
The java.util.Collections (plural) is a utility class that consists exclusively of static methods that operate on or return collections. 
Provides polymorphic algorithms to manipulate collections without needing to implement them from scratch.
Key Features:
Algorithms: Sorting, searching (binary search), reversing, and shuffling.
Wrappers: Creating thread-safe (synchronized) or unmodifiable (read-only) versions of existing collections.
Empty Collections: Returning immutable empty sets, lists, or maps to avoid null returns. 

Collection API:-
The Collection API (often called the Java Collections Framework) is the entire unified architecture for representing and manipulating collections. It consists of three main parts: 
Interfaces: Abstract data types like Collection, List, Set, and Map.
Implementations: Concrete classes that implement these interfaces, such as ArrayList, HashSet, and HashMap.
Algorithms: Static methods (mostly found in the Collections class) that perform useful computations like sorting and searching. 
*/
public class Collections {
  public static void main(String[] args) {
    Collection<Integer> num = new ArrayList<>(); // If you just want to add and fetch Collection make sense.
    num.add(15);
    num.add(25);
    num.add(5);
    num.add(10);
    List<Integer> nums = new ArrayList<>(); // work with indexed value then go for List.
    nums.add(15);
    nums.add(25);
    nums.add(5);
    nums.add(10);

    System.out.println(nums.get(2));
    System.out.println(nums.indexOf(25));

    for (Object elem : nums) {
      System.out.println(elem);
    }

    System.out.println("----- Set -------");

    Set<Integer> numss = new HashSet<>();
    numss.add(15);
    numss.add(25);
    numss.add(5);
    numss.add(10);
    numss.add(25);

    for (Object elem : numss) {
      System.out.println(elem);
    }

    System.out.println("----- Tree Set -------");

    Set<Integer> numsss = new TreeSet<>();
    numsss.add(15);
    numsss.add(25);
    numsss.add(5);
    numsss.add(10);
    numsss.add(25);

    for (Object elem : numsss) {
      System.out.println(elem);
    }

    System.out.println("----- Iterator -------");
    Iterator<Integer> values = numsss.iterator();
    while(values.hasNext())
      System.out.println(values.next());
    
    System.out.println("----- Map -------");
    Map<String, Integer> studentMap = new HashMap<>();
    // Map<String, Integer> studentMap = new Hashtable<>();
    studentMap.put("Navin", 56);
    studentMap.put("Vishal", 52);
    studentMap.put("Vishal", 51);
    studentMap.put("Harsh", 61);
    studentMap.put("Kiran", 74);
    // System.out.println(studentMap);
    // System.out.println(studentMap.get("Vishal"));
    for(String key :studentMap.keySet())
      System.out.println(key + " : " + studentMap.get(key));
  }
}
