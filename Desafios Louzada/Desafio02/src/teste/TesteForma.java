package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Forma;

class TesteForma {
	
    @org.junit.jupiter.api.Test
	void testaForma() {
		Forma forma = new Forma(1, 2, 3);
		assertEquals(forma.verificaForma(), "não eh um triangulo");

	}
}