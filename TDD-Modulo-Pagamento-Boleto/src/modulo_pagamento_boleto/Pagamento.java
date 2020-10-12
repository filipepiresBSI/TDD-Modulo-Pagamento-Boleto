package modulo_pagamento_boleto;

import java.util.Calendar;

public class Pagamento {
	
	private Calendar c = Calendar.getInstance();
	
	private String tipo = "BOLETO";
    private String data = c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR);
    private double valor = 1000.00;
	
    public String getTipo() {
		return tipo;
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
