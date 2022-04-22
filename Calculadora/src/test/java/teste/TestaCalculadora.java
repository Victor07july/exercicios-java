package teste;

import dominio.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestaCalculadora {

    @Test
    public void testSomar() {
          Calculadora calc = new Calculadora(6,2); 
          assertEquals(8, calc.soma(), 0);
        }
    
    @Test
    public void testSubtrair() {
          Calculadora calc = new Calculadora(6,2); 
          assertEquals(4, calc.subtracao(), 0);
        }
    
    @Test
    public void testMultiplicar() {
          Calculadora calc = new Calculadora(6,2); 
          assertEquals(12, calc.multiplicacao(), 0);
        }
    
    @Test
    public void testDivisao() {
          Calculadora calc = new Calculadora(6,2); 
          assertEquals(3, calc.divisao(), 0);
        }
}