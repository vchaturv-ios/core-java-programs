package streams;

@FunctionalInterface
public interface FuncInterfaceExample {
  void run2();
  private void run() {
    System.out.println("run method called");
  }
  default void run1() {
    run();
  }
}
