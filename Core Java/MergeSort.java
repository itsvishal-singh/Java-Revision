public class MergeSort {
  private static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }

  private static void merge(int[] array, int left, int mid, int right) {
    int sizeOfFirstArray = mid - left + 1;
    int sizeOfSecondArray = right - mid;

    int[] leftArray = new int[sizeOfFirstArray];
    int[] rightArray = new int[sizeOfSecondArray];

    for (int i = 0; i < sizeOfFirstArray; i++)
      leftArray[i] = array[left + i];

    for (int i = 0; i < sizeOfSecondArray; i++)
      rightArray[i] = array[mid + 1 + i];

    int first = 0;
    int second = 0;
    int count = left;

    while (first < sizeOfFirstArray && second < sizeOfSecondArray) {
      if (leftArray[first] <= rightArray[second]) {
        array[count] = leftArray[first];
        first++;
      } else {
        array[count] = rightArray[second];
        second++;
      }
      count++;
    }
    while (first < sizeOfFirstArray) {
      array[count] = leftArray[first];
      first++;
      count++;
    }
    while (second < sizeOfSecondArray) {
      array[count] = rightArray[second];
      second++;
      count++;
    }
  }

  public static void main(String[] args) {
    int[] array = { 5, 6, 3, 7, 2, 4 };
    System.out.println("Before Sorting ");
    for (int arr : array)
      System.out.print(arr + " ");

    mergeSort(array, 0, array.length - 1);

    System.out.println("\nAfter Sorting ");
    for (int arr : array)
      System.out.print(arr + " ");
  }

}
