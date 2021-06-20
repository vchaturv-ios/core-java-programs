package designpatterns.buildpattern;

public class CarShop {
  public static void main(String[] args) {
    Car car = new CarBuilder().setBrand("Hyundai").setColor("White").getCar();
    System.out.println(car);
  }
}
