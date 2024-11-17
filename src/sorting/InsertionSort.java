package sorting;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {9, 12, 14, 6, 15, 8, 13};
    insertionSort(arr, arr.length);
    System.out.println("After Insertion Sort: " + Arrays.toString(arr));
  }

  private static void insertionSort(int[] arr, int n) {
    for (int i = 0; i <= n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        // swap
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;

        j--;
      }
    }
  }
}
