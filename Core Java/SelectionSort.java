public class SelectionSort {
  public static void main(String[] args) {
    int[] nums = { 8, 6, 9, 2, 4, 5 };
    int temp = 0;
    int minIndex = -1;
    System.out.println("Before Sorting");
    for (int num : nums)
      System.out.print(num + " ");

    System.out.print("\n---Iterations---");
    for (int i = 0; i < nums.length - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[minIndex] > nums[j])
          minIndex = j;
      }
      temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;

      System.out.println();
      for (int num : nums)
        System.out.print(num + " ");
    }

    System.out.println("\nAfter Sorting");
    for (int num : nums)
      System.out.print(num + " ");
  }
}
