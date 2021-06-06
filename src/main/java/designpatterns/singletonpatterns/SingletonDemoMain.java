package designpatterns.singletonpatterns;

public class SingletonDemoMain {
  public static void main(String[] args) {
    SingletonDemo singletonDemo = SingletonDemo.getInstance();
    singletonDemo.sayHello();
  }
}
