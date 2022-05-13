package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Plano;

import org.junit.jupiter.api.Test;

class TestaPlano {
	Plano plano = new Plano(1, 2, 3, 4);
    
	@org.junit.jupiter.api.Test
	public void testaCalculaDistancia() {
		assertEquals(2.8284270763397217, plano.calculaDistancia());
	};
}
