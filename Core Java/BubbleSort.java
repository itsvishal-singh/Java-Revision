public class BubbleSort {
  public static void main(String[] args) {
    int[] nums = { 6, 3, 8, 4, 9, 1, 2 };
    int temp = 0;

    System.out.println("---Before Sorting-----");
    for (int num : nums)
      System.out.print(num + ", ");

    System.out.println();
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
      System.out.println();
      for (int num : nums)
        System.out.print(num + ", ");
    }

    System.out.println("\n---After Sorting-----");
    for (int num : nums)
      System.out.print(num + ", ");
  }
}
