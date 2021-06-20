package designpatterns.buildpattern;

public class CarBuilder {
  private long chasis;
  private String brand;
  private String manufacturingYear;
  private String color;

  public CarBuilder setChasis(long chasis) {
    this.chasis = chasis;
    return this;
  }

  public CarBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public CarBuilder setManufacturingYear(String manufacturingYear) {
    this.manufacturingYear = manufacturingYear;
    return this;
  }

  public CarBuilder setColor(String color) {
    this.color = color;
    return this;
  }
  
  public Car getCar() {
    return new Car(chasis, brand, manufacturingYear, color);
  }
}
