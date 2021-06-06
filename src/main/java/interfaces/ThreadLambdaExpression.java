package interfaces;

public class ThreadLambdaExpression {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      System.out.println("Thread is running");
    };

    Thread thread = new Thread(runnable);
    thread.start();
  }
}
