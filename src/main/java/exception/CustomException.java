package exception;

public class CustomException extends Exception{

  public CustomException(String message) {
    System.out.println(String.format("Give your exception message here...%s", message));
  }
}
