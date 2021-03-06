package geometria;

import geometria.LadoInvalidoException;
import geometria.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrianguloTest {

    private static final String MSG_INSIDE_EXCEPTION = "lado invalido";
    private static final String MSG_ISOSCELES = "isosceles";
    private static final String MSG_EQUILATERO = "equilatero";
    private static final String MSG_ESCALENO = "escaleno";
    private static final String MSG_NAO_FORMA_TRIANGULO = "NAO FORMA TRIANGULO";


    //C1,C2,C3,C4
    @Test
    public void testEquilatero() throws LadoInvalidoException{
        int LA = 5;
        int LB = 5;
        int LC = 5;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("EQUILATERO",result);
    }

    //C1,C2,C3,C5.1
    @Test
    public void testIsosceles1() throws LadoInvalidoException{
        int LA = 5;
        int LB = 5;
        int LC = 6;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ISOSCELES",result);
    }

    //C1,C2,C3,C5.2
    @Test
    public void testIsosceles2() throws LadoInvalidoException{
        int LA = 6;
        int LB = 5;
        int LC = 5;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ISOSCELES",result);
    }

    //C1,C2,C3,C5.3
    @Test
    public void testIsosceles3() throws LadoInvalidoException{
        int LA = 6;
        int LB = 5;
        int LC = 6;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ISOSCELES",result);
    }

    //C1,C2,C3,C6
    @Test
    public void testEscaleno() throws LadoInvalidoException{
        int LA = 4;
        int LB = 5;
        int LC = 6;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ESCALENO",result);
    }

    //C7
    @Test
    public void testLAInvalido() throws LadoInvalidoException{
        int LA = -2;
        int LB = 4;
        int LC = 5;
        assertThrows(LadoInvalidoException.class, () -> Triangulo.classificaTriangulo(LA, LB, LC));
    }

    //C8
    @Test
    public void testLBInvalido() throws LadoInvalidoException{
        int LA = 4;
        int LB = -2;
        int LC = 5;
        assertThrows(LadoInvalidoException.class, () -> Triangulo.classificaTriangulo(LA, LB, LC));
    }

    //C9
    @Test
    public void testLCInvalido() throws LadoInvalidoException{
        int LA = 4;
        int LB = 5;
        int LC = -2;
        assertThrows(LadoInvalidoException.class, () -> Triangulo.classificaTriangulo(LA, LB, LC));
    }

    //C10.1
    @Test
    public void testNaoTriangulo1() throws LadoInvalidoException{
        int LA = 10;
        int LB = 2;
        int LC = 3;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //C10.2
    @Test
    public void testNaoTriangulo2() throws LadoInvalidoException{
        int LA = 2;
        int LB = 10;
        int LC = 3;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //C10.3
    @Test
    public void testNaoTriangulo3() throws LadoInvalidoException{
        int LA = 3;
        int LB = 2;
        int LC = 10;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //meus testes
    //ID1
    @Test
    public void testFormaEquilatero() throws LadoInvalidoException{
        int LA = 5;
        int LB = 5;
        int LC = 5;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("EQUILATERO",result);
    }

    //ID2
    @Test
    public void testFormaIsoscelesCMaior() throws LadoInvalidoException{
        int LA = 5;
        int LB = 5;
        int LC = 6;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ISOSCELES",result);
    }

    //ID3
    @Test
    public void testFormaIsoscelesAMaior() throws LadoInvalidoException{
        int LA = 6;
        int LB = 5;
        int LC = 5;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ISOSCELES",result);
    }

    //ID4
    @Test
    public void testFormaIsoscelesBMaior() throws LadoInvalidoException{
        int LA = 5;
        int LB = 6;
        int LC = 5;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ISOSCELES",result);
    }

    //ID5
    @Test
    public void testFormaEscaleno() throws LadoInvalidoException{
        int LA = 4;
        int LB = 5;
        int LC = 6;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("ESCALENO",result);
    }

    //ID6 |6 | -2,4,5   |ERRO – valor inválido |C7                     |
    @Test
    public void testValorNegativoLadoAGeraErro() throws LadoInvalidoException{
        int LA = -2;
        int LB = 4;
        int LC = 5;
        String expectedMessage = "Valor Inválido";

        Exception exception = assertThrows(LadoInVálidoException.class, () -> {
            Triangulo.classificaTriangulo(LA, LB, LC);
        });


        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    //ID |7 | 4,-2,5   |ERRO – valor inválido |C8                     |
    @Test
    public void testValorNegativoLadoBGeraErro() throws LadoInvalidoException{
        int LA = 4;
        int LB = -2;
        int LC = 5;
        String expectedMessage = "Valor Inválido";

        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Triangulo.classificaTriangulo(LA, LB, LC);
        });


        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    //ID |8 | 4,5,-2   |ERRO – valor inválido |C9                     |
    @Test
    public void testValorNegativoLadoCGeraErro() throws LadoInvalidoException{
        int LA = 4;
        int LB = 5;
        int LC = -2;
        String expectedMessage = "Valor Inválido";

        Exception exception = assertThrows(LadoInVálidoException.class, () -> {
            Triangulo.classificaTriangulo(LA, LB, LC);
        });


        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


    //ID |9 | 10, 2, 3 |Não forma triângulo   |C10.1                  |
    @Test
    public void testNaoFormaTrianguloAMaior() throws LadoInvalidoException{
        int LA = 10;
        int LB = 2;
        int LC = 3;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //ID 10| 2, 10, 3 |Não forma triângulo   |C10.2                  |
    @Test
    public void testNaoFormaTrianguloBMaior() throws LadoInvalidoException{
        int LA = 2;
        int LB = 10;
        int LC = 3;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //ID 11|2, 3, 10  |Não forma triângulo   |C10.3                  |
    @Test
    public void testNaoFormaTrianguloCMaior() throws LadoInvalidoException{
        int LA = 2;
        int LB = 2;
        int LC = 10;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //ID 11|2, 3, 10  |Não forma triângulo   |C10.3                  |
    @Test
    public void testNaoFormaTrianguloCMaior() throws LadoInvalidoException{
        int LA = 2;
        int LB = 2;
        int LC = 10;
        String result = Triangulo.classificaTriangulo(LA, LB, LC);
        assertEquals("NAO FORMA TRIANGULO",result);
    }

    //Inicio testes de análise de Valor Limite
    //ID 12| 0, 3, 4 |ERRO – valor inválido |v5            |
    @Test
    public void testValorZeroLadoALancaException() throws LadoInvalidoException{
        int LA = 4;
        int LB = 5;
        int LC = -2;

        Exception exception = assertThrows(LadoInVálidoException.class, () -> {
            Triangulo.classificaTriangulo(LA, LB, LC);
        });


        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(MSG_INSIDE_EXCEPTION));
    }







}
