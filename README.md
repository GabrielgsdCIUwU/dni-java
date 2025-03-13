# Proyecto DNI Java

## Descripción

Este proyecto en Java está diseñado para validar números de DNI (Documento Nacional de Identidad) españoles. El DNI es un identificador único para los ciudadanos en España, compuesto por un número seguido de una letra. La letra se calcula a partir del número utilizando un algoritmo específico.

## Estructura del Proyecto

El proyecto está organizado en los siguientes archivos y clases:

- **Dni.java**: Clase principal que representa un DNI y contiene métodos para validar el DNI, obtener el número y la letra.
- **TablaAsignacion.java**: Clase que contiene la tabla de asignación de letras y métodos para calcular la letra correspondiente a un número de DNI.
- **DniTest.java**: Clase de pruebas unitarias para la clase `Dni`.
- **TablaAsignacionTest.java**: Clase de pruebas unitarias para la clase `TablaAsignacion`.

## Clases y Métodos

### Dni.java

- **Dni(String dni)**: Constructor que inicializa el DNI.
- **String getDni()**: Devuelve el DNI completo.
- **String getLetter()**: Devuelve la letra del DNI.
- **String getNumber()**: Devuelve el número del DNI.
- **Boolean isInputDniValid()**: Verifica si el DNI no está vacío.
- **Boolean isLengthDniValid()**: Verifica si la longitud del DNI es válida.
- **Boolean isDniValid()**: Verifica si el DNI es válido comprobando el número, la letra y la longitud.

### TablaAsignacion.java

- **char[] getTable()**: Devuelve la tabla de asignación de letras.
- **char getLetterFromPositionTable(int position)**: Devuelve la letra correspondiente a una posición en la tabla.
- **char calculateLetter(String dni)**: Calcula la letra correspondiente a un número de DNI.

## Pruebas Unitarias

### DniTest.java

- **getDni()**: Prueba para verificar que el método `getDni` devuelve el DNI correcto.
- **getLetter()**: Prueba para verificar que el método `getLetter` devuelve la letra correcta.
- **getNumber()**: Prueba para verificar que el método `getNumber` devuelve el número correcto.
- **validDni()**: Prueba para verificar que los DNIs válidos son reconocidos como válidos.
- **invalidDni()**: Prueba para verificar que los DNIs inválidos son reconocidos como inválidos.

### TablaAsignacionTest.java

- **getTableIsNotNull()**: Prueba para verificar que la tabla de asignación no es nula.
- **getLetterFromPosition()**: Prueba para verificar que las letras en posiciones específicas son correctas.
- **calculateLetter()**: Prueba para verificar que el cálculo de la letra es correcto.
- **getEveryLetterFromPosition()**: Prueba para verificar que todas las letras en la tabla son válidas.

## Cómo Ejecutar el Proyecto

1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en tu IDE preferido (por ejemplo, Visual Studio Code).
3. Ejecuta las pruebas unitarias para asegurarte de que todo funciona correctamente.

## Requisitos

- Java 8 o superior.
- JUnit 4 para las pruebas unitarias.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio que desees realizar.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
