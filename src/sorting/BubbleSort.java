package sorting;

import java.util.Arrays;

// push the maximum at last
// use adjustment swapping
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {13, 46, 9, 52, 20, 6};
    bubbleSort(arr, arr.length);
    System.out.println("After Bubble Sorting: " + Arrays.toString(arr));
  }

  private static void bubbleSort(int[] arr, int n) {
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
