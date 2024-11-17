package basic.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterHashing_0 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = "Atiullah Khan";
    char[] chars = name.replace(" ", "").toLowerCase().toCharArray();

    int[] hash = new int[26];
    for (int i = 0; i < chars.length; i++) {
      hash[chars[i] - 'a'] = hash[chars[i] - 'a'] + 1;
    }

    System.out.println(Arrays.toString(hash));
    System.out.println("Enter the number of operation to be performed");
    int operation = scan.nextInt();
    while (operation > 0) {
      System.out.println("Enter the character that you want to search");
      char chr = scan.next().charAt(0);
      System.out.println(chr + " " + hash[chr - 'a']);
      operation--;
    }
  }
}
