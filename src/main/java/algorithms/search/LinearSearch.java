package algorithms.search;

import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {

    int[] arr = new int[]{10, 78, 32, 56, 21};

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter element to be searched : ");

    int element = scanner.nextInt();

    int index = getElementIndex(arr, element);

    System.out.println(index);
  }

  private static int getElementIndex(int[] arr, int element) {
    //int index = 0;

    /*for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        index = i;
        break;
      }
      else
        index = -1;
    }
    return index;*/
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element)
        return i;
    }
    return -1;
  }
}
