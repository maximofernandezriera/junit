/*
 * This source file was generated by the Gradle 'init' task
 */
package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
@Test 
void testSumar() { 
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.sumar(2, 3); 
    assertEquals(5, resultado);
}

@Test 
void testRestar() {  
    Calculadora calculadora = new Calculadora(); 
    int resultado = calculadora.restar(5, 2);  
    assertEquals(4, resultado);
}

}
