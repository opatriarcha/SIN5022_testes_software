package romanos;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {

    /**
     * • O programa numerais romanos recebe uma string como parâmetro
            contendo um número romano e então o coverte para um número
            inteiro. Em numerais romanos as letras representam:
            – I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
       • Letras podem ser combinadas para formar números. As letras
            devem ser ordenadas do maior para o menor valor. Por exemplo,
            CCXVI seria 216. Para alguns números é preciso fazer a subtração de
            valores seguindo a notação. Por exemplo: IX = 9 (10 – 1), XL = 40
                (50-10), XIV = 14 (10+5-1)
     */
    
    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    
    @Test
    public void testExample(){
        int expected = NumerosRomanos.convert("I");
        int result = 1;
        assertEquals(expected,result);
    }
}
