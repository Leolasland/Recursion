public class Pow {

  public static int pow(int n, int m) {
    if (m == 1) {
      return n;
    }
    return n * pow(n, m - 1);
  }

  public static void main(String[] args) {
    System.out.println(pow(2, 6));
  }
}
