package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd {
  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 3, 2, 0, 0, 5, 4};
    //    bruteForce(arr, arr.length);
    optimalSolution(arr, arr.length);
  }

  private static void optimalSolution(int[] arr, int n) {
    int j = -1;
    // step 1: find the zero value index
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        j = i;
        break;
      }
    }

    // if no zero found
    if (j == -1) {
      System.out.println("Array is: " + Arrays.toString(arr));
      return;
    }

    // step 2: find the non-zero and swap with j index value (i.e. 0)
    for (int i = j + 1; i < n; i++) {
      if (arr[i] != 0) {
        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // increment j
        j++;
      }
    }
    System.out.println("Update Array is: " + Arrays.toString(arr));
  }

  private static void bruteForce(int[] arr, int n) {

    List<Integer> list = new ArrayList<>();

    // step 1: add all non-zero to the list
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        list.add(arr[i]);
      }
    }

    // update arr elements with list
    int size = list.size();
    for (int i = 0; i < size; i++) {
      arr[i] = list.get(i);
    }

    // replace remaining element of array with zero
    for (int i = size; i < n; i++) {
      arr[i] = 0;
    }

    System.out.println("Update Array is: " + Arrays.toString(arr));
  }
}
