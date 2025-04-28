
# Tarea: Reordenar los dígitos de un número

## Descripción
Tu tarea consiste en crear una función que tome cualquier entero no negativo como argumento y lo devuelva con sus dígitos en orden descendente. Básicamente, reorganiza los dígitos para obtener el mayor número posible.

### Ejemplos:
- **Entrada:** 42145  **Salida:** 54421
- **Entrada:** 145263 **Salida:** 654321
- **Entrada:** 123456789 **Salida:** 987654321

## Instrucciones

### a) TDD (Desarrollo guiado por pruebas)

Investiga lo que es el **TDD**, como aproximación básica vamos a escribir primero los test siguiendo esta filosofía y esta estructura. Ten en cuenta que los valores en el ejemplo no son los correctos:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;
```

### b) Investiga el uso de `assertEquals`

Investiga qué es el `assertEquals` y si hay más tipos de assert disponibles.

- `assertEquals` pasa el test si al comparar dos valores son iguales.
- Hay más tipos de `assert` disponibles, uno para cada caso que puede ser necesario para pasar un test:
    - `assertTrue()` pasa si la expresión es `true`.
    - `assertFalse()` pasa si la expresión es `false`.
    - `assertNull()` pasa si el valor es `null`.
    - `assertNotNull()` pasa si el valor no es `null`.
    - `assertArrayEquals()` compara dos arrays.

### c) Casos límite a comprobar

- El primero lo interesante sería que el `4` se repite y eso dependiendo de como se resuelva puede complicarlo.
- El caso de que ya esté ordenado pero de forma ascendente también es interesante.
- Incluir casos con `0` también podría ser importante.

### d) Escribe el código para cumplir los tests diseñados

Escribe el código que sea necesario para que cumpla con los tests diseñados en los apartados anteriores.
