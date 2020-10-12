package modulo_pagamento_boleto;

public class Boleto {
	
    private String codigo = "1234567";
    private String data = null;
    private double valor = 0.00;
	
    public double getValor() {
		return valor;
	}

    public String getCodigo() {
		return codigo;
	}
	
    public String getData() {
		return data;
	}
	
}
