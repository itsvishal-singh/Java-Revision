public class LinearSearch {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 8, 9 };
    int target = 8;

    for (int num : nums) {
      if (num == target)
        System.out.println("Found : " +num);
    }
  }
}