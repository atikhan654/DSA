package basic.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterHashing {
  public static void main(String[] args) {
    String name = "Atiullah Khan";

    Map<String, Integer> map = findDirect(name);
    System.out.println(map);
    System.out.println("Enter a character to check for occurrence");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println(input + " : " + map.get(input));
  }

  private static Map<String, Integer> findDirect(String name) {
    Map<String, Integer> map = new HashMap<>();
    if (name == null) return map;

    String[] nameArray = name.toLowerCase().replace(" ", "").split("");

    for (String str : nameArray) {
      if (map.get(str) == null) {
        map.put(str, 1);
      } else {
        map.put(str, map.get(str) + 1);
      }
    }
    return map;
  }
}
