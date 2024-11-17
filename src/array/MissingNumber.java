package array;

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    int n = 5;
    int missing_number;
    missing_number = brutForce(arr, n);
    missing_number = betterApproach(arr, n);
    missing_number = optimalSolution_1(arr, n);

    System.out.println("Missing Number is: " + missing_number);
  }

  private static int optimalSolution_1(int[] arr, int n) {
    int sum = n * (n + 1) / 2;
    int sumOfArrayNum = 0;
    for (int i = 0; i < arr.length; i++) {
      sumOfArrayNum += arr[i];
    }
    return sum - sumOfArrayNum;
  }

  private static int betterApproach(int[] arr, int n) {
    int[] hash = new int[n + 1];
    for (int i = 0; i < arr.length; i++) {
      hash[arr[i]] = 1;
    }

    for (int j = 1; j < hash.length; j++) {
      if (hash[j] == 0) return j;
    }
    return -1;
  }

  private static int brutForce(int[] arr, int n) {
    for (int i = 1; i <= n; i++) {
      int flag = 0;
      for (int j = 0; j < arr.length; j++) {
        if (i == arr[j]) {
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        return i;
      }
    }
    return -1;
  }
}
