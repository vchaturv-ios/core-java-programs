package designpatterns.buildpattern;

public class Phone {
  private String os;
  private int ram;
  private String processor;
  private double screemSize;
  private int battery;

  public Phone(String os, int ram, String processor, double screemSize, int battery) {
    super();
    this.os = os;
    this.ram = ram;
    this.processor = processor;
    this.screemSize = screemSize;
    this.battery = battery;
  }

  @Override
  public String toString() {
    return "Phone{" +
      "os='" + os + '\'' +
      ", ram=" + ram +
      ", processor='" + processor + '\'' +
      ", screemSize=" + screemSize +
      ", battery=" + battery +
      '}';
  }
}
