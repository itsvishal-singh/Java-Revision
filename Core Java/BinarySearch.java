public class BinarySearch {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 8, 9 };
    int target = 5;
    int left = 0;
    int right = nums.length - 1;
    int result = -1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        result = mid;
        break;
      } else if (nums[mid] < target)
        left = mid + 1;
      else
        right = mid - 1;
    }

    if (result != -1)
      System.out.println("Value of Index : " + result);
    else
      System.out.println("Element not found");
  }
}
