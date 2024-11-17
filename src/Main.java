public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 1, 0, 1, 1, 1};
    int maxConsecutiveOnes = findMaxConsecutiveOnes(arr);
    System.out.println("Maximum occurrences of one's: " + maxConsecutiveOnes);
  }

  private static int findMaxConsecutiveOnes(int[] arr) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count++;
        max = Math.max(max, count);
      } else {
        count = 0;
      }
    }
    return max;
  }
}
