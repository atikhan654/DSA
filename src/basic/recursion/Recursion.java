package basic.recursion;

public class Recursion {
  public static void main(String[] args) {
    System.out.println(fib(6));
  }

  private static void printNTimes(String name, int n) {
    if (n < 1) return;
    System.out.println(name);
    printNTimes(name, n - 1);
  }

  private static void printTillN(int i, int n) {
    if (i > n) return;
    System.out.println(i);
    printTillN(++i, n);
  }

  private static void printReverse(int n) {
    if (n == 1) return;
    System.out.println(n);
    printReverse(--n);
  }

  // some of first N numbers
  private static int sum(int n) {
    if (n == 0) return 0;
    return n + sum(--n);
  }

  private static void printFirstNNumber(int n) {
    int sum = (n * (n + 1)) / 2;
    System.out.println(sum);
  }

  private static int fact(int n) {
    if (n == 1) return 1;
    return n * fact(n - 1);
  }

  // using two pointers
  private static void reverseArray(int[] arr, int first, int last) {
    if (first >= last) return;
    swap(arr, first, last);
    reverseArray(arr, first + 1, last - 1);
  }

  private static void swap(int[] arr, int first, int last) {
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;
  }

  // palindrome
  private static boolean isPalindrome(String name, int start, int end) {
    if (start >= end) return true;
    if (name.charAt(start) != name.charAt(end)) return false;
    return isPalindrome(name, start + 1, end - 1);
  }

  private static boolean isPalindrome(String name, int i) {
    if (i >= name.length() / 2) return true;
    if (name.charAt(i) != name.charAt(name.length() - i - 1)) return false;
    return isPalindrome(name, i + 1);
  }

  private static int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
  }
}
