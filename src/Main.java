import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
Clase básica a crear:

public class ReOrdenar {

    public static int ordenarDesc(final int num) {

        //Your code

    }

}

public class ReOrdenar Test {

    @Test

    public void test_01() {
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }

/* @Alejandro Brito Silva
 *

 Tu tarea consiste en crear una función que tome cualquier entero no negativo como argumento y lo devuelva con sus dígitos en orden descendente. Básicamente, reorganiza los dígitos para obtener el mayor número posible.

 Ejemplos:

 Entrada: 42145 Salida: 54421

 Entrada: 145263 Salida: 654321

 Entrada: 123456789 Salida: 987654321


a) Investiga lo que es el TDD, como aproximación básica vamos a escribir primero los test siguiendo esta filosofía y esta estructura, ten en cuenta que los valores en el ejemplo no son los correctos:

 -import org.junit.Test;

-import static org.junit.Assert.assertEquals;

 b)Investiga qué es el assertEquals y si hay más tipos de assert.

 c) He puesto unos ejemplos, hay algún valor límite que sea interesante comprobar?

 d) Ahora escribe el código para que cumpla los tests diseñados anteriormente.

 */