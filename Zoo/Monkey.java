public class Monkey extends Animal {

  public Monkey(String name) {
    super(name, "Monkey", "OOh OO AAh aa");
  }

  @Override
  public void makeSound() {
    System.out.println(name + " says " + sound);
  }
}
