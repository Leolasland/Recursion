import java.util.ArrayList;
import java.util.List;

public class ListLengthCalculation {

  public static int length(List<Integer> list) {
    if (list == null || list.isEmpty()) {
      return 0;
    }
    ArrayList<Integer> copy = new ArrayList<>(list);
    copy.remove(0);
    return 1 + length(copy);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    System.out.println(length(list));
  }
}
