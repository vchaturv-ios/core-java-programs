package designpatterns.prototype;

public class CustomExceptionDemo {
  public void demo(String message) throws CustomException {
    if(message == null)
      throw new CustomException("Hi");
  }

  public static void main(String[] args) {
    CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
    try {
      customExceptionDemo.demo(null);
    }
    catch (CustomException e) {
      System.out.println("Exception called");
    }
  }
}
