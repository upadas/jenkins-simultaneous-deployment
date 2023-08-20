public class Car {
  protected String make;
  protected String model;
  protected int year;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public void show() {
    System.out.println(this.make + " " + this.model + " " + this.year);
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }
}
