public class GetSecondMax {

  public static int getSecondMax(int[] array) {
    if (array.length < 2) {
      return 0;
    }
    if (array[0] > array[1]) {
        return secondMax(array, array[0], array[1], 1);
    }
    return secondMax(array, array[1], array[0], 1);
  }

  public static int secondMax(int[] array, int max1, int max2, int i) {
	  if (i == array.length) {
	    return max2;
	  }
    if (max1 < array[i]) {
      max2 = max1;
      max1 = array[i];
    } else if (max2 < array[i]) {
      max2 = array[i];
    }
    return secondMax(array, max1, max2, ++i);
  }

  public static void main(String[] args) {
    int[] array = {5, 4, 3, 2, 5};
    System.out.println(getSecondMax(array));
  }
}
