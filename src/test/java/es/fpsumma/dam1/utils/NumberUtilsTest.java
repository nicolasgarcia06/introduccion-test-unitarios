package es.fpsumma.dam1.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
@Test
    public void sumaOK() {
        int resultado = NumberUtils.suma(2, 3);
        assertEquals(5,resultado);
    }

   @Test
   public void IsEven(){
    Boolean resultado=NumberUtils.isEven(n % 2 == 0);
    assertEquals(2,resultado);
   }

}