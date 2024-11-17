public class Test {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    int missingNumber = findMissingOptimal(arr, 5);
    System.out.println("Missing Number is: " + missingNumber);
  }

  private static int findMissingLinear(int[] arr, int n) {
    // linear search
    for (int i = 1; i <= n; i++) {
      int flag = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == i) {
          flag = 1;
          break;
        }
      }
      if (flag == 0) return i;
    }
    return -1;
  }

  private static int findMissingBetter(int[] arr, int n) {
    int[] hash = new int[n + 1];
    for (int i = 0; i < arr.length; i++) {
      hash[arr[i]]++;
    }

    for (int i = 1; i <= n + 1; i++) {
      if (hash[i] == 0) return i;
    }
    return -1;
  }

  private static int findMissingOptimal(int[] arr, int n) {
    int xor1 = 0;
    //    for (int i = 1; i <= n; i++) {
    //      xor1 = xor1 ^ i;
    //    }

    int xor2 = 0;
    for (int j = 0; j < arr.length; j++) {
      xor2 = xor2 ^ arr[j];
      xor1 = xor1 ^ (j + 1);
    }
    xor1 = xor1 ^ n;
    return xor1 ^ xor2;
  }
}
