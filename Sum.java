public class Sum {

  public static int sum(int number) {
    if (number == 0) {
      return number;
    } else {
      return number % 10 + sum(number / 10);
    }
  }

  public static void main(String[] args) {
    System.out.println(sum(12345));
  }
}