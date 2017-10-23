package projecteuler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class lastDigitTest {

  @Test
  public void ReturnTrueWhentwoNonNegitiveNumber()
  {
    assertEquals(true,lastDigit.lastDigitNumber(7, 12347));
  }
  
  @Test
  public void ReturnTruesingleTwodigitNumbersLastNumberSame()
  {
    assertEquals(true,lastDigit.lastDigitNumber(7, 17));
  }
  
  @Test
  
  public void ReturnComparingBigger3digitNumberwithSingleDigit()
  {
    assertEquals(true,lastDigit.lastDigitNumber(7, 117));
  }

  @Test
  
  public void ReturnFalseWhenLastdigitsNotMatching()
  {
    assertEquals(false,lastDigit.lastDigitNumber(7, 723523));
  }
  
  @Test
  
  public void ReturnTrueWhenbothNumbersareZero()
  {
    assertEquals(true, lastDigit.lastDigitNumber(0, 0));
  }
@Test
  
  public void ReturnTrueWhenbothNumbersareSame()
  {
    assertEquals(true, lastDigit.lastDigitNumber(7, 7));
  }
  
@Test 
public void returnValue()
{
  assertEquals(false, lastDigit.lastDigitNumber(7, 13528));
}

}

