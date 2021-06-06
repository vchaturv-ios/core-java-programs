package optionals;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    /*String[] strings = new String[10];
    //String lowerCaseString = strings[5].toLowerCase();
    //System.out.println(lowerCaseString);

    strings[5] = "OPTIONAL CLASS EXAMPLE";
    Optional<String> checkNull = Optional.ofNullable(strings[5]);
    checkNull.ifPresent(System.out::println);
    System.out.println(checkNull.get());
    System.out.println(strings[5].toLowerCase());

    *//*if (checkNull.isPresent()) {
      String lowerCaseString = strings[5].toLowerCase();
      System.out.println(lowerCaseString);
    } else {
      System.out.println("String is not a present");
    }*/

    String[] strings = new String[10];
    strings[5] = "JAVA OPTIONAL CLASS EXAMPLE";
    Optional<String> empty = Optional.empty();
    System.out.println(empty);

    Optional<String> value = Optional.of(strings[5]);

    System.out.println("Filtered Value : " + value.filter(p -> p.equals("Abc")));
    System.out.println("Filtered Value : " + value.filter(p -> p.equals("JAVA OPTIONAL CLASS EXAMPLE")));
    System.out.println("Getting Value : " + value.get());
    System.out.println("Getting Hashcode : " + value.hashCode());
    System.out.println("Is value present : " + value.isPresent());
    System.out.println("Nullable Optional : " + Optional.ofNullable(strings[5]));
    System.out.println("orElse : " + value.orElse("Value is not present"));
    System.out.println("orElse : " + empty.orElse("Value is not present"));
    value.ifPresent(System.out::println);
  }
}
