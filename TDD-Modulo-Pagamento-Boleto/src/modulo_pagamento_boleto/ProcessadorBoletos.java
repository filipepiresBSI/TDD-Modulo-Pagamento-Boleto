package modulo_pagamento_boleto;

import java.util.ArrayList;

public class ProcessadorBoletos {
	
	private ArrayList boletos;
	
	public ProcessadorBoletos() {
		boletos = new ArrayList();
	}
	
	public void adicionaBoletos(Boleto bl) {
		boletos.add(bl);
	}
	
	public int quantidadeBoletos() {
		return boletos.size();
	}
}
