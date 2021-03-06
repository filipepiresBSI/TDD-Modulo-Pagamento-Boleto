package modulo_pagamento_boleto;

import java.util.Calendar;

public class Fatura {
	
	private Calendar c = Calendar.getInstance();
	
	private String nome;
    private String data = c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR);
    private double valor;
	
    public String getNome() {
		return nome;
	}
	
    public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}
	
    public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
    
}
