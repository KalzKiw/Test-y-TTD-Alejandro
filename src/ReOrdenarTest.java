import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReOrdenarTest { //la palabra test tiene que ir junto al nombre de la clase

    @org.junit.Test
    @Test

    public void test_01() {
        assertEquals(54421, ReOrdenar.ordenarDesc(42145)); //primero ponemos la salida esperada y luego el número que meteríamos por parámetros
    }

    @Test
    void test_02() {
        assertEquals(654321, ReOrdenar.ordenarDesc(145263));
    }

    @Test
    void test_03() {
        assertEquals(987654321, ReOrdenar.ordenarDesc(123456789));
    }
}
