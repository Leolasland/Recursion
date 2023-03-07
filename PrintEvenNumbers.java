import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumbers {

  public static void printEvenNumbers(List<Integer> list) {
    ArrayList<Integer> copy = new ArrayList<>(list);
    if (copy.get(0) % 2 == 0) {
      System.out.println(copy.get(0));
    }
    copy.remove(0);
    if (!copy.isEmpty()) {
      printEvenNumbers(copy);
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    printEvenNumbers(list);
  }
}
