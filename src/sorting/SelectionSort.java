package sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {13, 46, 9, 52, 20, 6};
    selectionSort(arr, arr.length);
    System.out.println("After selection sort: " + Arrays.toString(arr));
  }

  private static void selectionSort(int[] arr, int n) {
    for (int i = 0; i <= n - 2; i++) {
      int min = i;
      for (int j = i + 1; j <= n - 1; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap(arr, i, min);
    }
  }

  private static void swap(int[] arr, int i, int min) {
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
  }
}
