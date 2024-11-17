package basic.math;

import java.util.*;

public class HCF {
  public static void main(String[] args) {
    System.out.println("Enter 2 numbers to get HCF");
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    int gcf = optimalApproach(a, b);
    System.out.println("Greatest Common factor of " + a + " and " + b + " is: " + gcf);
  }

  private static int optimalApproach(int a, int b) {
    while (a > 0 && b > 0) {
      if (a > b) a = a % b;
      else b = b % a;
    }
    if (a > 0) return a;
    return b;
  }

  private static int betterApproach(int a, int b) {
    int gcd = 1;
    int min = Math.min(a, b);
    for (int i = min; i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
        break;
      }
    }
    return gcd;
  }

  private static int bruteForce(int a, int b) {
    int gcd = 1;
    int min = Math.min(a, b);
    for (int i = 1; i <= min; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
}
