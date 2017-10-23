package projecteuler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class everyNthTest {

  @Test
  public void findEverysecondChar() {
    assertEquals("Mrce",everyNth.replacEveryNth("Miracle", 2));
  }

   @Test
   public void findEvery100thChar()
   {
     assertEquals("C",everyNth.replacEveryNth("Chocolates", 100));
   }
   @Test
   public void findEvery4thChar()
   {
     assertEquals("Coe",everyNth.replacEveryNth("Chocolates", 4));
   }
}
