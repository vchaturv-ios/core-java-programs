package datastructures.arrays;

public class ArrayRotateReversal {

  public static void main(String[] args) {
    int[] arrForLeft = new int[]{1, 2, 3, 4, 5, 6, 7};
    int[] arrForRight = new int[]{1, 2, 3, 4, 5, 6, 7};
    int d = 2;

    System.out.println("Original Array");
    System.out.println("==================");
    System.out.println();
    printArray(arrForLeft);
    System.out.println("\n");

    System.out.println("Left Rotated Array");
    System.out.println("==================");
    System.out.println();
    leftRotate(arrForLeft, d);
    printArray(arrForLeft);
    System.out.println("\n");

    System.out.println("Right Rotated Array");
    System.out.println("==================");
    System.out.println();
    rightRotate(arrForRight, d);
    printArray(arrForRight);

  }

  static void leftRotate(int[] arr, int d) {
    if (d == 0)
      return;
    int n = arr.length;

    d = d % n;
    reverseArray(arr, 0, d - 1);
    reverseArray(arr, d, n - 1);
    reverseArray(arr, 0, n - 1);
  }

  static void rightRotate(int[] arr, int d) {
    if (d == 0)
      return;
    int n = arr.length;

    d = d % n;
    reverseArray(arr, 0, n - 1);
    reverseArray(arr, d, n - 1);
    reverseArray(arr, 0, d - 1);
  }

  static void reverseArray(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void printArray(int arr[])
  {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

}
