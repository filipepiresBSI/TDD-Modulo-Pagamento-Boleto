package tdd_modulo_pagamento_boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modulo_pagamento_boleto.Boleto;
import modulo_pagamento_boleto.Fatura;
import modulo_pagamento_boleto.Pagamento;
import modulo_pagamento_boleto.ProcessadorBoletos;

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
	    ft.setValor(150.00);
	    Assertions.assertTrue(ft.getValor() > 0.00);
	    
	}
	
	@DisplayName("Testa a criacao de um pagamento")
	@Test
	public void testeCriacaoPagamento() {
		
		Pagamento pg = new Pagamento();
	    Assertions.assertTrue(!pg.getTipo().equals(null));
	    Assertions.assertTrue(!pg.getData().equals(null));
	    pg.setValor(1500.00);
	    Assertions.assertTrue(pg.getValor() > 0);
	    
	}
	
	@DisplayName("Testa o processador de boletos")
	@Test
	public void testeAdicionaBoletos() {
		
		ProcessadorBoletos pb = new ProcessadorBoletos();
		Boleto bl = new Boleto();
		bl.setValor(55.00);
		pb.adicionaBoletos(bl);
		Assertions.assertTrue(pb.quantidadeBoletos() > 0);
		
	}
	
	@Test
	public void testePagamentoFaturaPagaIgual() {
		
		ProcessadorBoletos pb = new ProcessadorBoletos();
		
		Boleto b1 = new Boleto();
		b1.setValor(500.00);
		Boleto b2 = new Boleto();
		b2.setValor(400.00);
		Boleto b3 = new Boleto();
		b3.setValor(600.00);
		
		pb.adicionaBoletos(b1);
		pb.adicionaBoletos(b2);
		pb.adicionaBoletos(b3);
		
		Fatura ft = new Fatura();
		ft.setValor(1500.00);
		
		pb.pagamentoFatura(ft);
		
		Assertions.assertEquals("FATURA PAGA", pb.getSituacao());
	
	}
}

