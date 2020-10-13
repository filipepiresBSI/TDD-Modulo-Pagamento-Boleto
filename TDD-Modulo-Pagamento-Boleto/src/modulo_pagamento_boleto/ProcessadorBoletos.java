package modulo_pagamento_boleto;

import java.util.ArrayList;
import java.util.Iterator;

public class ProcessadorBoletos {
	
	private ArrayList boletos;
	private String situacao;

	public ProcessadorBoletos() {
		boletos = new ArrayList();
	}
	
	public String getSituacao() {
		return situacao;
	}

	public void adicionaBoletos(Boleto bl) {
		boletos.add(bl);
	}
	
	public int quantidadeBoletos() {
		return boletos.size();
	}
	
	public ArrayList<Pagamento> pagamentoFatura(Fatura ft) {
		
		ArrayList pagamentos = new ArrayList();
		double fatura = ft.getValor();
		
		for (Iterator i = boletos.iterator(); i.hasNext();) {
			Boleto boleto = (Boleto) i.next();
			fatura -= boleto.getValor();
			Pagamento pg = new Pagamento();
			pg.setValor(boleto.getValor());
			pagamentos.add(pg);
		}
		
		if(fatura <= 0.00) situacao = "FATURA PAGA";
		else situacao = "FATURA NAO PAGA";
		
		return pagamentos;
	}
	
	
}
