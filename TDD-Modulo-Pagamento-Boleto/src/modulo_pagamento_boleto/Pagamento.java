package modulo_pagamento_boleto;

public class Pagamento {
	
	private String tipo = null;
    private String data = null;
    private double valor = 0.00;
	
    public String getTipo() {
		return tipo;
	}
	
    public String getData() {
		return data;
	}
	
    public double getValor() {
		return valor;
	}
    
}
