import java.util.ArrayList;
import java.util.List;

public class PrintEvenIndex {

  public static void printEvenIndex(List<Integer> list, int indexCount) {
    if (list.isEmpty() || indexCount >= list.size()) {
      return;
    }
    if (indexCount % 2 == 0) {
      System.out.println(list.get(indexCount));
    }
    printEvenIndex(list, ++indexCount);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    printEvenIndex(list, 0);
  }
}
