package designpatterns.singletonpatterns;

public class SingletonDemo {

  private SingletonDemo() {};

  public void sayHello() {
    System.out.println("sayHello() called...");
  }

  public static SingletonDemo getInstance() {
    return new SingletonDemo();
  }
}
