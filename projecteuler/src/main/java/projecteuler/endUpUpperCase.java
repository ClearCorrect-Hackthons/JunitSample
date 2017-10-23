package projecteuler;

public class endUpUpperCase {

  public static String endUpUpper(String str)
  {
    if (str.length()<3)
    {
      return str.toUpperCase();
    }
    String result="";
    if (str.length()>=3)
    {
      result = str.substring(str.length()-3,str.length());
    }
    
    return str.substring(0,str.length()-3) + result.toUpperCase();
  }
  
}
