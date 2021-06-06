package forEach;

import java.util.ArrayList;
import java.util.List;

public class ListIterateUsingFE {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);

    myList.forEach(value -> System.out.println(value));
  }
}
