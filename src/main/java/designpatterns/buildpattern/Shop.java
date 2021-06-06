package designpatterns.buildpattern;

public class Shop {

  public static void main(String[] args) {
    Phone phone = new PhoneBuilder().setOs("Android").setBattery(5).getPhone();
    System.out.println(phone);
  }
}
