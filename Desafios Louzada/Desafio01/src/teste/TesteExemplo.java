package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Produto;

public class TesteExemplo {
	Produto produto = new Produto(137, 10, 5, 3);
	
	@org.junit.jupiter.api.Test
	public void testaCalculaDesconto() {
		assertEquals(2.5, produto.calculaDesconto(), 1);
	}
	
	@org.junit.jupiter.api.Test
	public void testeValorFinal() {
		assertEquals(47.5, produto.valorFinal(), 1);
	}
}