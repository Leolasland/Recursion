import java.util.Locale;

public class StringPalindrome {

  public static boolean isPalindrome(String s) {
    String tmp = s.replaceAll("\\W", "");
    int size = tmp.length();
    if (size <= 1) {
      return true;
    }
    char firstChar = tmp.charAt(0);
    char lastChar = tmp.charAt(size - 1);
    if (firstChar != lastChar) {
        return false;
    }
    String substring = tmp.substring(1, size - 1);
    return isPalindrome(substring);
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("level"));
  }
}
