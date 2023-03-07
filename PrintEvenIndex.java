import java.util.ArrayList;
import java.util.List;

public class PrintEvenIndex {

  public static void printEvenIndex(List<Integer> list) {
    if (list.isEmpty()) {
      return;
    }
    ArrayList<Integer> copy = new ArrayList<>(list);
    System.out.println(copy.get(0));
    if (copy.size() > 1) {
      copy.remove(1);
    }
    copy.remove(0);
    printEvenIndex(copy);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    printEvenIndex(list);
  }
}
