public class GetSecondMax {

  public static int getSecondMax(int[] array) {
    if (array.length <= 0) {
      return 0;
    }
    return secondMax(array, 0, 0, 0);
  }

  public static int secondMax(int[] array, int max1, int max2, int i) {
    if (i < array.length) {
      if (max1 < array[i]) {
        max2 = secondMax(array, array[i], max2, ++i);
      } else if (max2 < array[i]) {
        max2 = secondMax(array, max1, array[i], ++i);
      } else {
        max2 = secondMax(array, max1, max2, ++i);
      }
    }
    return max2;
  }

  public static void main(String[] args) {
    int[] array = {5, 4, 3, 2, 5};
    System.out.println(getSecondMax(array));
  }
}
