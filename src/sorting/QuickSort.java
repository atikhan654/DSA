package sorting;

import java.util.Arrays;

/**
 * sort an array in ascending/descending order
 * Time complexity is same as MergeSort i.e O(nlogn) but space complexity will be O(1)
 * follow:
 * 1. Pick-up a pivot (first/median/last/random element) and place in its correct place
 * 2. smaller on the left and larger on the right
 */
public class QuickSort {
  public static void main(String[] args) {
    int[] arr = {4, 1, 4, 7, 9, 3};
    System.out.println("Array before sorting: " + Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println();
    System.out.println("Array after sorting: " + Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pIndex = partition(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i < high) i++;
      while (arr[j] > pivot && j > low) j--;
      if (i < j)
        swap(arr, i, j);
    }
    swap(arr, low, j);
    return j;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
