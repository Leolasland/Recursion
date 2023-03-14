public class GetSecondMax {

  public static Integer getSecondMax(int[] array) {
    if (array.length < 2) {
      return null;
    }
    return secondMax(array, array[0], null, 1);
  }

  public static int secondMax(int[] array, Integer max1, Integer max2, int i) {
    if (i < array.length) {
      if (max1 < array[i]) {
        max2 = secondMax(array, array[i], max1, ++i);
      } else if (max2 == null || max2 < array[i]) {
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
