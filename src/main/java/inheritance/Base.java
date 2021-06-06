package inheritance;

public abstract class Base {
  static int a = 5;
  int x;

  abstract void run();

  public void display() {
    System.out.println("display()...");
  }

  Base() {
    x = 7;
  }
}
