package inheritance;

public class Derived extends Base{

  Derived() {
    super();
  }
  @Override
  void run() {
    System.out.println("Running...");
  }

  public static void main(String[] args) {
    Derived derived = new Derived();
    System.out.println(derived.x);
  }
}
