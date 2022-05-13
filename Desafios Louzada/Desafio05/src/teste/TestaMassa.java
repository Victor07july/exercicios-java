package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Massa;
import org.junit.jupiter.api.Test;

class TestaMassa {
	Massa massa = new Massa(10);
	
    @org.junit.jupiter.api.Test
	public void testaControlaMassa() {
		massa.calculaTempo();
		
		assertEquals(10.0, massa.getMassaInicial());
		assertEquals(0.3125, massa.getMassaFinal());
		assertEquals(250, massa.getTempo());
	}
}