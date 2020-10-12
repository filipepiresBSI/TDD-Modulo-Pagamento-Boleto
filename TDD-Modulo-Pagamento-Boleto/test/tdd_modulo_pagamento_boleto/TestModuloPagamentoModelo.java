package tdd_modulo_pagamento_boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modulo_pagamento_boleto.Boleto;

@DisplayName("Classe para teste do Modulo de Pagamento de Boleto")
public class TestModuloPagamentoModelo {
	
	@DisplayName("Testa a criacao de um boleto")
	@Test
	public void testeCriacaoBoletos() {
		Boleto bl = new Boleto();
	    Assertions.assertTrue(!bl.getCodigo().equals(null));
	    Assertions.assertTrue(!bl.getData().equals(null));
	}

}
