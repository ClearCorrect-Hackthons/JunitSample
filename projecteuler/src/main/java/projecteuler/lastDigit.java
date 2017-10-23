package projecteuler;

public class lastDigit {

  
  public static boolean lastDigitNumber(int a, int b)
  {
    if (a==b){
      return true;
    }
    
    
     return (a % 10 == b % 10 );
  }
  
  
}
