package forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ForEachDemo {
  public static void main(String[] args) {
    Map<Integer, Integer> hMap = new HashMap<>();
    for (int i = 1; i < 6; i++) {
      hMap.put(i,i);
    }

    //Java 8 approach
    //hMap.forEach((k, v) -> System.out.println(k+":"+v));
    //hMap.entrySet().forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));

    //Java 7 approach
    for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
      System.out.println(entry.getKey()+":"+entry.getValue());
    }
  }
}
