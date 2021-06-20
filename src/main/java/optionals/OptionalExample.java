package optionals;

import java.util.Optional;

public class OptionalExample {
  public static void main(String[] args) {
    String[] strings = new String[10];
    String lowerCaseString = strings[5].toLowerCase();
    System.out.println(lowerCaseString);
    Optional<String> optionalS = Optional.ofNullable(strings[5]);
    if (optionalS.isEmpty())
      System.out.println("Value is not present");
    else
      System.out.println("Value is present : "+optionalS.get());
  }
}
