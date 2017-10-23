package projecteuler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class endUpUpperCaseTest {

  
  @Test
  public void endUpTest5Char()
  {
    assertEquals("HeLLO",endUpUpperCase.endUpUpper("Hello"));
  }
  
  @Test
  
  public void endUpTestLessthan3Char()
  {
    assertEquals("HI",endUpUpperCase.endUpUpper("hi"));
  }
  
  @Test
  public void endUpTestEmptyString()
  {
    assertEquals("", endUpUpperCase.endUpUpper(""));
  }
  
  @Test
  public void endUpTestBiggerStringWithSpaces()
  {
    assertEquals("this is my big string with spaCES", endUpUpperCase.endUpUpper("this is my big string with spaces"));
  }
}
