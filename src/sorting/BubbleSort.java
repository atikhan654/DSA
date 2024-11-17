package sorting;

import java.util.Arrays;

/**
 * pushes the maximum to the last, by doing adjustment swap
 * Worst,Average time complexity -> O(n2),
 * and Best case O(n) {Do not forget to add break else it will run till O(n2)}
 */
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {13, 46, 9, 52, 20, 6};
    bubbleSort(arr);
    System.out.println("After Bubble Sorting: " + Arrays.toString(arr));
  }

  private static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = n - 1; i >= 1; i--) {
      int didSwap = 0;
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swapping
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          didSwap = 1;
        }
      }
      if (didSwap == 0) break;
    }
  }
}
