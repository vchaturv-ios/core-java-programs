package designpatterns.prototype;

public class CustomException extends Exception{

  public CustomException(String message) {
    System.out.println("Exception thrown : "+message);
  }
}
