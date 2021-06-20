package datastructures.arrays;

import java.util.Arrays;

public class ArrayRotate {
  public static void main(String[] args) {
    int[] arrForLeftRotate = new int[]{1, 2, 3, 4, 5};
    int[] arrForRightRotate = new int[]{1, 2, 3, 4, 5};

    System.out.println("Left Rotated Array : ");
    System.out.println("=====================");

    System.out.println(Arrays.toString(leftRotate(arrForLeftRotate, 2)));

    System.out.println("Right Rotated Array : ");
    System.out.println("=====================");

    System.out.println(Arrays.toString(rightRotate(arrForRightRotate, 2)));

  }

  private static int[] leftRotate(int[] arr, int d) {
    int i = 0;
    while (i < d) {
      int temp = arr[0];
      for (int k = 0; k < arr.length - 1; k++) {
        arr[k] = arr[k + 1];
      }
      arr[arr.length - 1] = temp;
      i++;
    }
    return arr;
  }

  private static int[] rightRotate(int[] arr, int d) {
    int i = 0;
    while (i < d) {
      int temp = arr[arr.length-1];
      for(int j = arr.length-1; j > 0; j--) {
        arr[j] = arr[j-1];
      }
      arr[0] = temp;
      i++;
    }
    return arr;
  }
}
