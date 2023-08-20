public class runCalculator {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int sum = calculator.add(1, 2);
    if (sum != 3) {
      System.out.println("Test Failed");
    } else {
      System.out.println("Test Passed");
    }
  }
}
  