package methodreference;

public class MethodReference {

  public static void saySomething(String name) {
    System.out.println("saySomething is called with : "+name);
  }

  public static void main(String[] args) {
    Sayable sayable = MethodReference::saySomething;
    sayable.say("Vishnu");
  }
}
