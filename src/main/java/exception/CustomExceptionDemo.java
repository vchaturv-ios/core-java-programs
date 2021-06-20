package exception;

public class CustomExceptionDemo {

  public void run(String message) throws CustomException {
    if(message == null)
      throw new CustomException(null);
    else
      System.out.println(String.format("Message is : %s", message));
  }

  public static void main(String[] args) {
    CustomExceptionDemo demo = new CustomExceptionDemo();
    try {
      demo.run(null);
    } catch (CustomException e) {
      e.printStackTrace();
    }
  }
}
