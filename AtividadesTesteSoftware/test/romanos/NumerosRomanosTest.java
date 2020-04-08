package romanos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {

    @Test
    public void testExample(){
        int expected = NumerosRomanos.convert("I");
        int result = 1;
        assertEquals(expected,result);
    }
}
