package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Paralelepipedo;

import org.junit.jupiter.api.Test;

class TestaParalelepipedo {
	
	Paralelepipedo paralelepipedo = new Paralelepipedo(1, 5, 13);
	
	@Test
	void testaCalculaDiagonal() {
		assertEquals(13.96424, paralelepipedo.calculaDiagonal(), 1);
	}

}
