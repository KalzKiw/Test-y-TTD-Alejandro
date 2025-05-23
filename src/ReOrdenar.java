import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

 class ReOrdenar {

    public static int ordenarDesc(final int num) {
        String numeros = String.valueOf(num); //Pasamos el numero string
        String[] unidad = numeros.split(""); //Separamos los numeros por unidades con ""

        Arrays.sort(unidad);  //ahora podemos ordenar los numeros por unidades de menor a mayor
        StringBuilder ordenado = new StringBuilder(); //Utilizamos StringBuilder para poder concatenar de nuevo todo
        for(int i = unidad.length - 1 ; i >= 0; i--){ //Recorremos el array ordenando de mayor a menor
            ordenado.append(unidad[i]); //Aquí lo concatenamos
        }
        return Integer.parseInt(ordenado.toString());  //Convertimos String de nuevo a un número

    }
}

/* @Alejandro Brito Silva
 *

 Tu tarea consiste en crear una función que tome cualquier entero no negativo como argumento y lo devuelva con sus dígitos en orden descendente.
 Básicamente, reorganiza los dígitos para obtener el mayor número posible.

 Ejemplos:

 Entrada: 42145 Salida: 54421

 Entrada: 145263 Salida: 654321

 Entrada: 123456789 Salida: 987654321


a) Investiga lo que es el TDD, como aproximación básica vamos a escribir primero los test siguiendo esta filosofía y esta estructura,
 ten en cuenta que los valores en el ejemplo no son los correctos:

 -import org.junit.Test;

-import static org.junit.Assert.assertEquals;

 b)Investiga qué es el assertEquals y si hay más tipos de assert.

 >>assertEquals pasa el test si al comparar dos valores son iguales, hay más tipos de assert, uno por cada caso que puede ser necesario para pasar un test.
 >>assertTrue() pasa si es true, assertFalse() pasa si es falso, assertNull() pasa si es null y assertNotNull pasa si no es nul, assertArrayEquals() compara dos arrays...
 >> Hay muchos más pero la idea es que compruebe que se cumpla algo para pasar un test.

 c) He puesto unos ejemplos, hay algún valor límite que sea interesante comprobar?
 *
 >>En el primero lo interesante sería que el 4 se repite y eso dependiendo de como se resuelva puede complicarlo.
 >>El caso de que ya esté ordenado pero de forma ascendente también es interesante. Y poner alguno con 0 también podría haber sido un buen caso.
 *
 d) Ahora escribe el código para que cumpla los tests diseñados anteriormente.

 */