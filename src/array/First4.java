package array;

public class First4 {
  public static void main(String[] args) {
    int[] arr = {8, 3, 1, 4, 7, 7, 5, 2};

    int largest = findLargest(arr);
    System.out.println("Largest element is: " + largest);

    int sLargest = secondLargest(arr);
    System.out.println("Second largest element is: " + sLargest);

    int ssmallest = secondSmallest(arr);
    System.out.println("Second smallest element is: " + ssmallest);

    boolean isSorted = isSorted(arr);
    System.out.println("Is array sorted? " + isSorted);

    int[] arr1 = {1, 2, 2, 3, 3, 3, 4, 4};
    int k = removeDuplicate(arr1);
    System.out.println("Array after removing the duplicates");
    for (int i = 0; i < k; i++) {
      System.out.print(arr1[i] + " ");
    }
  }

  private static int secondSmallest(int[] arr) {
    int small = arr[0];
    int ssmall = Integer.MAX_VALUE;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < small) {
        ssmall = small;
        small = arr[i];
      } else if (arr[i] < ssmall && arr[i] != small) {
        ssmall = arr[i];
      }
    }
    return ssmall;
  }

  private static int removeDuplicate(int[] arr) {
    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[i] != arr[j]) {
        arr[++i] = arr[j];
      }
    }
    return (i + 1);
  }

  private static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] <= arr[i]) {
        // blank
      } else {
        return false;
      }
    }
    return true;
  }

  private static int secondLargest(int[] arr) {
    int largest = arr[0];
    int sLargest = Integer.MIN_VALUE;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        sLargest = largest;
        largest = arr[i];
      } else if (arr[i] > sLargest && arr[i] != largest) {
        sLargest = arr[i];
      }
    }

    return sLargest;
  }

  private static int findLargest(int[] arr) {
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
}
