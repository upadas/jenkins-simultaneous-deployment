public class Lion extends Animal {

  public Lion(String name) {
    super(name, "Lion", "Roar");
  }

  @Override
  public void makeSound() {
    System.out.println(name + " says " + sound);
  }
}
