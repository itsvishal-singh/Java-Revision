public class InsertionSort {
  public static void main(String[] args) {
    int[] nums = { 6, 3, 8, 4, 1 };

    System.out.println("---Before Sorting-----");
    for (int num : nums)
      System.out.print(num + ", ");

    System.out.print("\n---Iterations---");
    for (int i = 0; i < nums.length; i++) {
      int key = nums[i];
      int j = i - 1;
      while (j >= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = key;

      System.out.println();
      for (int num : nums)
        System.out.print(num + ", ");
    }

    System.out.println("\n---After Sorting-----");
    for (int num : nums)
      System.out.print(num + ", ");
  }
}
