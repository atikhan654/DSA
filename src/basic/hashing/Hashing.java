package basic.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
  public static void main(String[] args) {
    System.out.println("Enter the size of the array");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    // initializing
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println("Arrays is: " + Arrays.toString(arr));

    int[] hash = new int[12];
    for (int i = 0; i < n; i++) {
      hash[arr[i]] = hash[arr[i]] + 1;
    }

    System.out.println("Enter the number of operations to perform");
    int operation = scanner.nextInt();
    while (operation > 0) {
      System.out.println("Enter the number that you want to search");
      int number = scanner.nextInt();

      // search for the frequency of the given number
      System.out.println("Frequency of " + number + " is: " + hash[number]);
      operation--;
    }
  }
}
