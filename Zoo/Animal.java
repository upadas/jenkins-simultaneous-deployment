public abstract class Animal {
  protected String name;
  protected String animal;
  protected String sound;

  public Animal(String name, String animal, String sound) {
    this.name = name;
    this.animal = animal;
    this.sound = sound;
  }

  public abstract void makeSound();

  public String getName() {
    return name;
  }

  public String getAnimal() {
    return animal;
  }
}
