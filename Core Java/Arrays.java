/*
Array: 
Stores a fixed-size, sequential collection of elements of the same type,
It is treated as an object in Java and provides efficient index-based access
*/
public class Arrays {
  public static void main(String[] args) {

    // String type Array
    // Literal Initialization: Declare and fill with values immediately
    String cars[] = { "Volvo", "BMW", "Ford", "Mazda" };
    for (int i = 0; i < cars.length; i++)
      System.out.print(cars[i] + ", ");
    System.out.println();
    cars[2] = "Alto"; // Updating
    System.out.println(cars[2]);

    // integer type Array with size of 2
    // Declaration & Instantiation: Reserve memory for a specific size.
    int arr[] = new int[2];
    arr[0] = 8;
    arr[1] = 5;

    for (int array : arr) // Enhanced For Loop
      System.out.print(array + ", ");
    System.out.println();

    // Multidimensional Arrays
    // 2D Array
    // int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };

    int array[][] = new int[2][3];
    array[0][0] = 9;
    array[0][1] = 8;
    array[0][2] = 7;
    array[1][0] = 6;
    array[1][1] = 5;
    array[1][2] = 4;
    for (int[] array1 : array) {
      for (int j = 0; j < array.length + 1; j++) {
        System.out.print(array1[j] + " ");
      }
      System.out.println();
    }

    // 3D Array
    int arrayy[][][] = new int[2][3][2];
    arrayy[0][0][0] = 9;
    arrayy[0][0][1] = 8;
    arrayy[0][1][0] = 7;
    arrayy[0][1][1] = 6;
    arrayy[0][2][0] = 5;
    arrayy[0][2][1] = 4;
    arrayy[1][0][0] = 9;
    arrayy[1][0][1] = 8;
    arrayy[1][1][0] = 7;
    arrayy[1][1][1] = 6;
    arrayy[1][2][0] = 5;
    arrayy[1][2][1] = 4;
    for (int[][] arrayy1 : arrayy) {
      for (int j = 0; j < arrayy.length + 1; j++) {
        for (int k = 0; k < arrayy.length; k++) {
          System.out.print(arrayy1[j][k] + " ");
        }
        System.out.print(" | ");
      }
      System.out.println();
    }

  }
}
