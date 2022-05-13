package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Amostra;

import org.junit.jupiter.api.Test;

class testaAmostra {
    
	@org.junit.jupiter.api.Test
	void testaControlaAmostra() {
		Amostra amostra = new Amostra(12, 13, 14, 15);
		assertEquals(7, amostra.informaGrau());
	}
}
