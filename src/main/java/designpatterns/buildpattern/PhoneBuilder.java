package designpatterns.buildpattern;

public class PhoneBuilder {

  private String os;
  private int ram;
  private String processor;
  private double screemSize;
  private int battery;

  public PhoneBuilder setOs(String os) {
    this.os = os;
    return this;
  }

  public PhoneBuilder setRam(int ram) {
    this.ram = ram;
    return this;
  }

  public PhoneBuilder setProcessor(String processor) {
    this.processor = processor;
    return this;
  }

  public PhoneBuilder setScreemSize(double screemSize) {
    this.screemSize = screemSize;
    return this;
  }

  public PhoneBuilder setBattery(int battery) {
    this.battery = battery;
    return this;
  }

  public Phone getPhone() {
    return new Phone(os,ram,processor,screemSize,battery);
  }
}
