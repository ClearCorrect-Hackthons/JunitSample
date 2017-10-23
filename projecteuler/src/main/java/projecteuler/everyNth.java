package projecteuler;

public class everyNth {
  
  public static String replacEveryNth(String str, int n) {
    if (n == 0) {
      return str;
    }
    String result = "";
    for (int i = 0; i < str.length(); i = i + n) {
      result = result + str.charAt(i);
    }
    return result;
  }
}
