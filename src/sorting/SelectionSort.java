package sorting;

import java.util.Arrays;

/**
 * get the minimum and place it to its exact place (using swapping)
 * first for loop -> select mini
 * second for loop -> compare mini with each element in the array
 */
public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {13, 46, 9, 52, 20, 6, 0};
    selectionSort(arr, arr.length);
    System.out.println("After selection sort: " + Arrays.toString(arr));
  }

  private static void selectionSort(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      int mini = i;
      for (int j = i; j < n; j++) {
        if (arr[j] < arr[mini]) {
          mini = j;
        }
      }
      swap(arr, i, mini);
    }
  }

  private static void swap(int[] arr, int i, int min) {
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
  }
}
