package array;

public class LongestSubArrayPositiveSum {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 0, 1, 1, 1, 0, 1, 4, 2, 3};
    int k = 3;
    int longestLen = bruteForce(arr, k);

    System.out.println("Longest length: " + longestLen);
  }

  private static int bruteForce(int[] arr, int k) {
    int n = arr.length;
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
      long sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == k) {
          maxLen = Math.max(maxLen, j - i + 1);
        }
      }
    }
    return maxLen;
  }
}
