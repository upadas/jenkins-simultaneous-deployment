import java.util.ArrayList;
import java.util.List;

public class Zoo {
  private String name;
  private List<Animal> animals;

  public Zoo(String name) {
    this.name = name;
    this.animals = new ArrayList<>();
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public void showAnimals() {
    for (Animal animal : animals) {
      animal.makeSound();
    }
  }

  public static void main(String[] args) {
    Zoo zoo = new Zoo("Sasi's Zoo");

    Monkey monkey1 = new Monkey("Vaali");
    Monkey monkey2 = new Monkey("Sugreev");
    Lion lion1 = new Lion("Simba");
    Lion lion2 = new Lion("Mufasa");

    zoo.addAnimal(monkey1);
    zoo.addAnimal(monkey2);
    zoo.addAnimal(lion1);
    zoo.addAnimal(lion2);

    System.out.println(zoo.name);
    zoo.showAnimals();
  }
}
