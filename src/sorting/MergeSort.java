package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = {13, 46, 9, 52, 20, 6};
    int length = arr.length;
    mergeSort(arr, 0, length - 1);

    System.out.println("Array after sorting: " + Arrays.toString(arr));
  }

  private static void mergeSort(int[] arr, int low, int high) {
    if (low == high) return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);
    mergeArray(arr, low, mid, high);
  }

  private static void mergeArray(int[] arr, int low, int mid, int high) {
    List<Integer> list = new ArrayList<>();

    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] < arr[right]) {
        list.add(arr[left]);
        left++;
      } else {
        list.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      list.add(arr[left]);
      left++;
    }

    while (right <= high) {
      list.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = list.get(i - low);
    }
  }
}
