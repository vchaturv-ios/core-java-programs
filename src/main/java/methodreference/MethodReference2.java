package methodreference;

public class MethodReference2 {
  public static void threadRun() {
    System.out.println("Thread is running");
  }
  public static void main(String[] args) {

    Thread thread = new Thread(MethodReference2::threadRun);
    thread.start();
  }
}
