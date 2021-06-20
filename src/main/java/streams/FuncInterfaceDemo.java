package streams;

public class FuncInterfaceDemo {
  public static void main(String[] args) {
    FuncInterfaceExample example = () -> {
      System.out.println("Method call in interface");
    };
  }
}
