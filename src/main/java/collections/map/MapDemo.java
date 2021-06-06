package collections.map;

import java.util.*;

public class MapDemo {
  public static void main(String[] args) {
    /*Map<Integer, String> names = new TreeMap<>();
    names.put(1, "Vishnu");
    names.put(2, "Krishna");
    names.put(3, "Prachi");
    names.put(4, "Asha");
    //names.put(null, "Ajay");
    names.put(5, null);


    names.forEach((key, value) -> System.out.println(key+"===>"+value));*/

    System.out.println("List Implementation");
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(2);
    numbers.add(null);
    numbers.add(null);
    numbers.add(3);


    numbers.forEach(System.out::println);

    System.out.println("\nVector Implementation");

    List<Integer> numVector = new Vector<>();
    numVector.add(1);
    numVector.add(3);
    numVector.add(2);
    numVector.add(null);
    numVector.add(null);
    numVector.add(3);

    numVector.forEach(System.out::println);

    System.out.println("\nLinkedList Implementation");
    List<Integer> numLinkedList = new LinkedList<>();
    numLinkedList.add(1);
    numLinkedList.add(3);
    numLinkedList.add(2);
    numLinkedList.add(null);
    numLinkedList.add(null);
    numLinkedList.add(3);

    numLinkedList.forEach(System.out::println);


    System.out.println("\nSet Implementation");

    Set<Integer> numberSet = new HashSet<Integer>();
    numberSet.add(1);
    numberSet.add(1);
    numberSet.forEach(System.out::println);




  }
}
