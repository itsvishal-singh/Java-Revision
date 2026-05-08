public class CombineSearching {

  public static int binarySearch(int[] nums, int target) {
    int steps = 0;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      steps++;
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        System.out.println("Steps taken by Binary Search : " + steps);
        return mid;
      } else if (nums[mid] < target)
        left = mid + 1;
      else
        right = mid - 1;
    }
    System.out.println("Steps taken by Binary Search : " + steps);
    return -1;
  }

  public static int linearSearch(int[] nums, int target) {
    int steps = 0;
    for (int i = 0; i < nums.length; i++) {
      steps++;
      if (nums[i] == target) {
        System.out.println("Steps taken by Linear Search : " + steps);
        return i;
      }

    }
    System.out.println("Steps taken by Linear Search : " + steps);
    return -1;
  }

  public static void main(String[] args) {
    // int[] nums = { 2, 3, 4, 5, 6, 7, 8, 19 };
    int[] nums = new int[1000];

    int target = 900;
    int resultBS = binarySearch(nums, target);
    int resultLS = linearSearch(nums, target);
    if (resultBS != -1)
      System.out.println("Element found at Index : " + resultBS + " by Binary Search");
    else
      System.out.println("Element not Found by Binary Search");
    if (resultLS != -1)
      System.out.println("Element found at Index : " + resultLS + " by Linear Search");
    else
      System.out.println("Element not Found by Linear Search");
  }
}
