public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    long actual = service.calculate(amount, registered);
    long expected = 30;
    boolean passed = expected == actual;

    System.out.println(passed);
  }
}

