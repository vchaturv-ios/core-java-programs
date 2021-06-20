package interprogram;

public class Logical1 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("For i = "+i);
      i++;
      System.out.println("i++: "+i);
      ++i;
      System.out.println("++i: "+i);
      System.out.println("hello");
    }
  }
}
