package array;

import java.util.Arrays;

public class LeftRotation {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 1;
    //    leftRotation(arr, arr.length, k);
    k = 3;
    leftRotationBy3WithoutTemp(arr, arr.length, k);
  }

  private static void leftRotationBy3WithoutTemp(int[] arr, int n, int k) {
    if (n == 0) return;
    k = k % n;

    reverseElement(arr, 0, k - 1);
    reverseElement(arr, k, n - 1);
    reverseElement(arr, 0, n - 1);

    System.out.println(Arrays.toString(arr));
  }

  private static void reverseElement(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  private static void leftRotationBy3(int[] arr, int length, int k) {
    if (length == 0) return;

    k = k % length; // k = 8 -> 7+1 = 1 rotation
    int[] temp = new int[k];

    // adding element into temp
    for (int i = 0; i < k; i++) {
      temp[i] = arr[i];
    }

    // shifting arr element
    for (int i = 0; i < length - k; i++) {
      arr[i] = arr[i + k];
    }

    // adding temp value to arr
    for (int i = length - k; i < length; i++) {
      arr[i] = temp[i - length + k];
    }

    System.out.println(Arrays.toString(arr));
  }

  private static void leftRotation(int[] arr, int length, int k) {
    int temp = arr[0];

    // shifting all element one step left
    for (int i = 1; i < length; i++) {
      arr[i - k] = arr[i];
    }
    // storing first element at last
    arr[length - 1] = temp;

    System.out.println(Arrays.toString(arr));
  }
}
