package sorting;

import java.util.Arrays;

/** Place the element and place it in its correct order
 * Worst and Average case - O(n2), Best case O(n)
 * */
public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {9, 12, 14, 6, 15, 8, 13};
    insertionSort(arr);
    System.out.println("After Insertion Sort: " + Arrays.toString(arr));
  }

  private static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i <= n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        // swap
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
  }
}
