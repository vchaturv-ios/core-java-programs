package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 implements FunctionalInterfaceDemo{
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
    List<String> namesStartWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());


  }

  public String runDemo(String name, FunctionalInterfaceDemo demo) {
    return demo.run(name);
  }

  @Override
  public String run(String name) {
    return null;
  }
}
