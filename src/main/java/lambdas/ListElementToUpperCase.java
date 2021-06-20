package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListElementToUpperCase {

  public static void main(String[] args) {
    List<String> wordsList = new ArrayList<>();
    wordsList.add("Vishnu");
    wordsList.add("Loves");
    wordsList.add("Prachi");

    System.out.println(wordsList.stream().map(String::toUpperCase).collect(Collectors.toList()));
  }
}
