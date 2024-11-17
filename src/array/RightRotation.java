package array;

import java.util.Arrays;

public class RightRotation {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 2;
    //    rotateToRight(arr, arr.length, k);
    rotateToRightNoThird(arr, arr.length, k);
  }

  private static void rotateToRightNoThird(int[] arr, int n, int k) {
    if (n == 0) return;
    k = k % n;
    reverseElements(arr, 0, n - k - 1);
    reverseElements(arr, n - k, n - 1);
    reverseElements(arr, 0, n - 1);

    System.out.println(Arrays.toString(arr));
  }

  private static void reverseElements(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  private static void rotateToRight(int[] arr, int length, int k) {
    if (length == 0) return;
    k = k % length;

    int[] temp = new int[k];

    // add element to temp
    for (int i = 0; i < k; i++) {
      temp[i] = arr[length - k + i];
    }

    // rotate arr elements
    for (int i = length - 1; i >= k; i--) {
      arr[i] = arr[i - k];
    }

    // add temp into arr
    for (int i = 0; i < k; i++) {
      arr[i] = temp[i];
    }
    System.out.println(Arrays.toString(arr));
  }
}
