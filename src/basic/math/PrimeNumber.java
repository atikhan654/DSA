package basic.math;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println("Enter a number to check for prime");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int count = checkPrime(n);

    System.out.println("count: " + count);

    if (count > 2) System.out.println(n + " is not a prime number");
    else System.out.println(n + " is a prime number");
  }

  private static int checkPrime(int n) {
    int count = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        count++;
        if ((n / i) != i) count++;
      }
    }
    return count;
  }
}
