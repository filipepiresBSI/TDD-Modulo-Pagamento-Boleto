package tdd_modulo_pagamento_boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modulo_pagamento_boleto.Boleto;
import modulo_pagamento_boleto.Fatura;

@DisplayName("Classe para teste do Modulo de Pagamento de Boleto")
public class TestModuloPagamentoModelo {
	
	@DisplayName("Testa a criacao de um boleto")
	@Test
	public void testeCriacaoBoletos() {
		
		Boleto bl = new Boleto();
	    Assertions.assertTrue(!bl.getCodigo().equals(null));
	    Assertions.assertTrue(!bl.getData().equals(null));
	    bl.setValor(50.00);
	    Assertions.assertTrue(bl.getValor() > 0.00);
	    
	}
    
	@DisplayName("Testa a criacao de uma fatura")
	@Test
	public void testeCriacaoFatura() {
		
		Fatura ft = new Fatura();
		ft.setNome("Sicrano de Beltrano");
	    Assertions.assertTrue(!ft.getNome().equals(null));
	    Assertions.assertTrue(!ft.getData().equals(null));
	    Assertions.assertTrue(ft.getValor() > 0.00);
	}
}
