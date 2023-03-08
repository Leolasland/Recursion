public class GetSecondMax {

  public static int getSecondMax(int[] array, int max, int max2) {
    int next = array[0];
    if (max < next) {
      getSecondMax(array, next, max);
    } else if (max2 < next) {
      getSecondMax(array, max, next);
    } else {
      getSecondMax(array, max, max2);
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] array = {5, 4, 3, 2, 1};
    System.out.println(getSecondMax(array, 0, 0));
  }
}
