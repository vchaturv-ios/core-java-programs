package designpatterns.buildpattern;

public class Car {
  private long chasis;
  private String brand;
  private String manufacturingYear;
  private String color;

  public Car(long chasis, String brand, String manufacturingYear, String color) {
    this.chasis = chasis;
    this.brand = brand;
    this.manufacturingYear = manufacturingYear;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car{" +
      "chasis=" + chasis +
      ", brand='" + brand + '\'' +
      ", manufacturingYear='" + manufacturingYear + '\'' +
      ", color='" + color + '\'' +
      '}';
  }
}
