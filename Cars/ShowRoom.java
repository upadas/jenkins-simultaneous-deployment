import java.util.ArrayList;
import java.util.List;

public class ShowRoom {
  public String name;
  public List<Car> cars;

  public ShowRoom(String name) {
    this.name = name;
    this.cars = new ArrayList<>();
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public void showCars() {
    System.out.println("The showroom " + name + " has:");
    for (Car car : cars) {
      car.show();
    }
  }

  public static void main(String[] args) {
    ShowRoom showRoom = new ShowRoom("Tagore's Luxury Cars");

    Car car1 = new Car("Tesla", "Model S", 2020);
    Car car2 = new Car("Honda", "Odyssey", 2021);
    Car car3 = new Car("Nissan", "Sentra", 1990);

    showRoom.addCar(car1);
    showRoom.addCar(car2);
    showRoom.addCar(car3);

    showRoom.showCars();

    ShowRoom showRoom1 = new ShowRoom("Sasi's Luxury Cars");

    Car car4 = new Car("Volvo", "Model Y", 2022);
    Car car5 = new Car("Mitsubishi", "Eclipse", 2023);
    showRoom1.addCar(car4);
    showRoom1.addCar(car5);
    showRoom1.showCars();
  }
}
