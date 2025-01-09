# **JUnit en proyectos Java**

## **Introducción a JUnit**

JUnit es un framework de código abierto ampliamente utilizado para escribir y ejecutar pruebas unitarias en Java1. Es una herramienta esencial en el desarrollo de software moderno, ya que facilita la verificación del correcto funcionamiento de unidades individuales de código (métodos o clases) de forma automatizada2. JUnit es una piedra angular del desarrollo guiado por pruebas (TDD), donde las pruebas se escriben antes del código, impulsando el proceso de diseño e implementación. En TDD, JUnit ayuda a garantizar que el código cumpla con los requisitos y funcione como se espera desde el principio.

JUnit 5 es la versión actual del framework, que se centra en Java 8 y versiones posteriores3. Evolucionó del proyecto JUnit Lambda y ofrece una base moderna para las pruebas en la JVM, permitiendo diferentes estilos de prueba.

### **¿Para qué se utiliza JUnit?**

JUnit se utiliza principalmente para realizar pruebas unitarias, un tipo de prueba de software que se centra en verificar el comportamiento de componentes individuales de una aplicación1. JUnit es a menudo utilizado para pruebas unitarias y es uno de los frameworks xUnit. Las pruebas unitarias son una parte fundamental del desarrollo de software moderno, ya que ayudan a:

* **Detectar errores de forma temprana:** Al probar unidades de código individuales, los errores se pueden identificar y corregir rápidamente, antes de que se propaguen a otras partes del sistema.  
* **Mejorar la calidad del código:** Las pruebas unitarias fomentan la escritura de código modular, bien definido y fácil de mantener.  
* **Facilitar la refactorización:** Con un conjunto de pruebas unitarias sólido, los desarrolladores pueden refactorizar el código con confianza, sabiendo que las pruebas detectarán cualquier error introducido durante el proceso.  
* **Documentar el código:** Las pruebas unitarias pueden servir como documentación del código, mostrando ejemplos de cómo se espera que se comporte cada unidad4.  
* **Medir la cobertura del código:** JUnit se puede utilizar para medir la cobertura del código, es decir, qué porcentaje del código está siendo cubierto por las pruebas5. Esto ayuda a garantizar que todas las partes del código se estén probando y que no haya partes sin probar que puedan contener errores.

## **Añadiendo JUnit a un proyecto Java**

Casi todos los IDEs y las herramientas de compilación permiten integrar test automáticos de prueba, incluyendo JUnit6. JUnit se puede integrar fácilmente en un proyecto Java utilizando gestores de dependencias como Maven o Gradle.

### **Maven**

Para añadir JUnit a un proyecto Maven, se debe agregar la siguiente dependencia al archivo pom.xml:

XML

`<dependency>`  
    `<groupId>org.junit.jupiter</groupId>`  
    `<artifactId>junit-jupiter-api</artifactId>`  
    `<version>5.10.0</version>`  
    `<scope>test</scope>`  
`</dependency>`

### **Gradle**

En un proyecto Gradle, se debe agregar la siguiente dependencia al archivo build.gradle:

Groovy

`dependencies {`  
    `testImplementation 'org.junit.jupiter:junit-jupiter-api:5.10.0'`  
`}`

## **Anotaciones básicas de JUnit**

JUnit utiliza anotaciones para identificar los métodos de prueba y controlar su ejecución. Algunas de las anotaciones más comunes son:

* **@Test:** Indica que un método es un método de prueba.  
* **@BeforeEach:** Indica que un método se debe ejecutar antes de cada método de prueba.  
* **@AfterEach:** Indica que un método se debe ejecutar después de cada método de prueba.  
* **@BeforeAll:** Indica que un método se debe ejecutar una vez antes de todas las pruebas de la clase.  
* **@AfterAll:** Indica que un método se debe ejecutar una vez después de todas las pruebas de la clase.  
* **@Disabled:** Desactiva una prueba o una clase de prueba7.

## **Métodos assert de JUnit**

Los métodos assert son utilizados en JUnit para verificar las condiciones esperadas en una prueba. Si una condición no se cumple, la prueba falla. Algunos de los métodos assert más comunes son:

* **assertEquals(expected, actual):** Verifica si dos valores son iguales8.

Java

`@Test`  
`void testSumar() {`  
    `Calculadora calculadora = new Calculadora();`  
    `int resultado = calculadora.sumar(2, 3);`  
    `assertEquals(5, resultado);`  
`}`

* **assertTrue(condition):** Verifica si una condición es verdadera.

Java

`@Test`  
`void testEsMayorQueCero() {`  
    `int numero = 5;`  
    `assertTrue(numero > 0);`  
`}`

* **assertFalse(condition):** Verifica si una condición es falsa.

Java

`@Test`  
`void testNoEsNulo() {`  
    `String texto = "Hola";`  
    `assertFalse(texto == null);`  
`}`

* **assertNotEquals(unexpected, actual):** Verifica si dos valores son diferentes.

Java

`@Test`  
`void testRestar() {`  
    `Calculadora calculadora = new Calculadora();`  
    `int resultado = calculadora.restar(5, 2);`  
    `assertNotEquals(4, resultado);`  
`}`

* **assertNull(object):** Verifica si un objeto es nulo.

Java

`@Test`  
`void testObjetoNulo() {`  
    `Object objeto = null;`  
    `assertNull(objeto);`  
`}`

* **assertNotNull(object):** Verifica si un objeto no es nulo.

Java

`@Test`  
`void testObjetoNoNulo() {`  
    `String texto = "Hola";`  
    `assertNotNull(texto);`  
`}`

* **assertSame(expected, actual):** Verifica si dos referencias apuntan al mismo objeto.

Java

`@Test`  
`void testReferenciasIguales() {`  
    `Object objeto1 = new Object();`  
    `Object objeto2 = objeto1;`  
    `assertSame(objeto1, objeto2);`  
`}`

* **assertNotSame(unexpected, actual):** Verifica si dos referencias no apuntan al mismo objeto.

Java

`@Test`  
`void testReferenciasDiferentes() {`  
    `Object objeto1 = new Object();`  
    `Object objeto2 = new Object();`  
    `assertNotSame(objeto1, objeto2);`  
`}`

* **assertArrayEquals(expectedArray, resultArray):** Verifica si dos arrays son iguales9.

Java

`@Test`  
`void testArraysIguales() {`  
    `int array1 = {1, 2, 3};`  
    `int array2 = {1, 2, 3};`  
    `assertArrayEquals(array1, array2);`  
`}`

* **assertThrows(expectedException, executable):** Verifica si un bloque de código lanza una excepción del tipo esperado.

Java

`@Test`  
`void testLanzarExcepcion() {`  
    `assertThrows(ArithmeticException.class, () -> {`  
        `int resultado = 10 / 0;`  
    `});`  
`}`

* **assertTimeout(duration, executable):** Verifica si un bloque de código se completa dentro de un tiempo límite determinado.

Java

`@Test`  
`void testTiempoLimite() {`  
    `assertTimeout(Duration.ofMillis(1000), () -> {`  
        `// Código que debe completarse en menos de 1 segundo`  
        `Thread.sleep(500);`  
    `});`  
`}`

## **Ejemplo de código**

A continuación, se muestra un ejemplo de una clase simple de Java y su correspondiente clase de prueba JUnit:

**Clase Calculadora:**

Java

`public class Calculadora {`

    `public int sumar(int a, int b) {`  
        `return a + b;`  
    `}`

    `public int restar(int a, int b) {`  
        `return a - b;`  
    `}`  
`}`

**Clase de prueba CalculadoraTest:**

Java

`import org.junit.jupiter.api.Test;`  
`import static org.junit.jupiter.api.Assertions.*;`

`public class CalculadoraTest {`

    `@Test`  
    `void testSumar() {`  
        `Calculadora calculadora = new Calculadora();`  
        `int resultado = calculadora.sumar(2, 3);`  
        `assertEquals(5, resultado);`  
    `}`

    `@Test`  
    `void testRestar() {`  
        `Calculadora calculadora = new Calculadora();`  
        `int resultado = calculadora.restar(5, 2);`  
        `assertEquals(3, resultado);`  
    `}`  
`}`

En este ejemplo, la clase CalculadoraTest contiene dos métodos de prueba, testSumar() y testRestar(), que utilizan el método assertEquals() para verificar si los resultados de los métodos sumar() y restar() de la clase Calculadora son los esperados.

## **Ejecutar pruebas JUnit**

Las pruebas JUnit se pueden ejecutar desde la línea de comandos o desde un IDE.

### **Línea de comandos**

Para ejecutar pruebas JUnit desde la línea de comandos, se debe utilizar el comando mvn test (para Maven) o gradle test (para Gradle)1011.

### **IDE**

La mayoría de los IDEs modernos, como Eclipse e IntelliJ IDEA, tienen integración con JUnit, lo que permite ejecutar las pruebas directamente desde el IDE12. En general, se puede ejecutar una prueba JUnit haciendo clic derecho sobre la clase de prueba o el método de prueba y seleccionando la opción "Run as JUnit Test".

### **Utilizando Ant**

Ant es otra herramienta de construcción que se puede utilizar para ejecutar pruebas JUnit8. Para configurar Ant para ejecutar pruebas JUnit, se debe crear un archivo build.xml que defina las tareas necesarias. En este archivo, se debe especificar la ubicación de las bibliotecas de JUnit y la ubicación de las clases de prueba.

## **Interpretar los resultados de las pruebas**

Los resultados de las pruebas JUnit se muestran en una ventana o panel específico del IDE o en la consola, en el caso de la ejecución desde la línea de comandos13. Los resultados indican si las pruebas han pasado o han fallado. En caso de fallo, se proporciona información sobre el error, como el mensaje de error y la traza de la pila14.

## **Mejores prácticas para escribir pruebas JUnit**

* **Escribir pruebas claras y concisas:** Cada prueba debe centrarse en un solo aspecto del código y ser fácil de entender.  
* **Utilizar nombres descriptivos para las pruebas:** El nombre de cada prueba debe indicar claramente qué se está probando.  
* **Escribir pruebas independientes:** Las pruebas no deben depender unas de otras.  
* **Probar casos límite y casos de error:** Además de los casos normales, se deben probar los casos límite y los casos de error para asegurar la robustez del código15.  
* **Mantener las pruebas actualizadas:** A medida que el código evoluciona, las pruebas deben actualizarse para reflejar los cambios.

## **Conclusión**

JUnit es una herramienta esencial para el desarrollo de software en Java. Facilita la escritura y ejecución de pruebas unitarias, lo que ayuda a mejorar la calidad del código, detectar errores de forma temprana y garantizar la fiabilidad de las aplicaciones. Al seguir las mejores prácticas para escribir pruebas JUnit, los desarrolladores pueden crear un conjunto de pruebas sólido que contribuya a la creación de software robusto y mantenible. La integración de JUnit en el proceso de desarrollo no solo mejora la calidad del código, sino que también fomenta un enfoque más disciplinado y eficiente para la construcción de software.

#### **Obras citadas**

1\. JUnit \- Wikipedia, fecha de acceso: enero 9, 2025, [https://en.wikipedia.org/wiki/JUnit](https://en.wikipedia.org/wiki/JUnit)  
2\. rcasalla.gitbooks.io, fecha de acceso: enero 9, 2025, [https://rcasalla.gitbooks.io/libro-desarrollo-de-software/content/libro/temas/t\_pruebas/prue\_junit.html\#:\~:text=JUnit%20es%20un%20framework%20relativamente,cada%20m%C3%A9todo%20de%20la%20clase.](https://rcasalla.gitbooks.io/libro-desarrollo-de-software/content/libro/temas/t_pruebas/prue_junit.html#:~:text=JUnit%20es%20un%20framework%20relativamente,cada%20m%C3%A9todo%20de%20la%20clase.)  
3\. JUnit 5, fecha de acceso: enero 9, 2025, [https://junit.org/](https://junit.org/)  
4\. Escribir y ejecutar pruebas JUnit \- IBM, fecha de acceso: enero 9, 2025, [https://www.ibm.com/docs/es/radfws/9.6.1?topic=tutorial-writing-running-junit-tests](https://www.ibm.com/docs/es/radfws/9.6.1?topic=tutorial-writing-running-junit-tests)  
5\. Curso Testing con JUnit \- Sesión 1 \- OpenBootcamp \- YouTube, fecha de acceso: enero 9, 2025, [https://www.youtube.com/watch?v=4SD8q891ZQc](https://www.youtube.com/watch?v=4SD8q891ZQc)  
6\. Integracion de JUnit en Maven y en Eclipse \- Ejemplos de Java y C/Linux \- ChuWiki, fecha de acceso: enero 9, 2025, [https://old.chuidiang.org/java/herramientas/test-automaticos/junit-eclipse-maven.php](https://old.chuidiang.org/java/herramientas/test-automaticos/junit-eclipse-maven.php)  
7\. Course All lectures for ES purposes \- Lecture: Anotaciones útiles en JUnit \- CodeGym, fecha de acceso: enero 9, 2025, [https://codegym.cc/es/quests/lectures/es.questservlets.level03.lecture03](https://codegym.cc/es/quests/lectures/es.questservlets.level03.lecture03)  
8\. Junit Assert \- BrowserStack, fecha de acceso: enero 9, 2025, [https://www.browserstack.com/guide/assertequals-java](https://www.browserstack.com/guide/assertequals-java)  
9\. JUnit \- Using Assertion \- TutorialsPoint, fecha de acceso: enero 9, 2025, [https://www.tutorialspoint.com/junit/junit\_using\_assertion.htm](https://www.tutorialspoint.com/junit/junit_using_assertion.htm)  
10\. JUnit 5 \- Cómo ejecutar tests unitarios en Maven \- Marc Nuri, fecha de acceso: enero 9, 2025, [https://blog.marcnuri.com/junit5-como-ejecutar-tests-unitarios-en-maven](https://blog.marcnuri.com/junit5-como-ejecutar-tests-unitarios-en-maven)  
11\. Tutorial de JUnit: Configuración, escritura y ejecución de pruebas unitarias de Java, fecha de acceso: enero 9, 2025, [https://es.parasoft.com/blog/junit-tutorial-setting-up-writing-and-running-java-unit-tests/](https://es.parasoft.com/blog/junit-tutorial-setting-up-writing-and-running-java-unit-tests/)  
12\. Cómo configurar y crear tests de JUnit 5 en IntelliJ IDEA \- YouTube, fecha de acceso: enero 9, 2025, [https://www.youtube.com/watch?v=D3pw2HWcgtc](https://www.youtube.com/watch?v=D3pw2HWcgtc)  
13\. JUnit: Testing para Kotlin, cómo hacer pruebas unitarias con este curso \- YouTube, fecha de acceso: enero 9, 2025, [https://m.youtube.com/watch?v=eTIuKcgBpLU](https://m.youtube.com/watch?v=eTIuKcgBpLU)  
14\. interpreting JUnit test results? \- java \- Stack Overflow, fecha de acceso: enero 9, 2025, [https://stackoverflow.com/questions/26595452/interpreting-junit-test-results](https://stackoverflow.com/questions/26595452/interpreting-junit-test-results)  
15\. Dominando los Test Unitarios en JAVA | JUnit \- YouTube, fecha de acceso: enero 9, 2025, [https://www.youtube.com/watch?v=mEzoe6KSUu8](https://www.youtube.com/watch?v=mEzoe6KSUu8)
