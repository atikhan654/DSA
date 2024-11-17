package basic.patterns;

import java.util.Scanner;

public class PatternMain {
  static void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  static void pattern7(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j < n - i + 1; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      // space
      for (int j = 1; j < n - i + 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void pattern8(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
        System.out.print("*");
      }
      // space
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void pattern10(int n) {
    int star = 1;
    for (int i = 1; i <= 2 * n - 1; i++) {
      for (int j = 1; j <= star; j++) {
        System.out.print("*");
      }
      if (i < n) star += 1;
      else star -= 1;
      System.out.println();
    }
  }

  static void pattern11(int n) {
    int start = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        start = 1 - start;
        System.out.print(start);
      }
      System.out.println();
    }
  }

  static void pattern12(int n) {
    for (int i = 1; i <= n; i++) {
      // number
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // space
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // number
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      System.out.println();
    }
  }

  static void pattern13(int n) {
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count++ + " ");
      }
      System.out.println();
    }
  }

  static void pattern14(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(Character.toChars('A' + j));
      }
      System.out.println();
    }
  }

  static void pattern15(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(Character.toChars('A' + j));
      }

      System.out.println();
    }
  }

  static void pattern16(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(Character.toChars('A' + i));
      }

      System.out.println();
    }
  }

  static void pattern17(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 'E' - i; j <= 'E'; j++) {
        System.out.print(Character.toChars(j));
      }
      System.out.println();
    }
  }

  static void pattern18(int n) {

    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // print characters
      char start = 'A';
      int breakPoint = (2 * i) / 2;
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(start);
        if (j <= breakPoint) start++;
        else start--;
      }
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter the input");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println("------------------------");
    pattern11(n);
  }
}
