package modulo_pagamento_boleto;

import java.util.Random;

public class Boleto {
	
	private Random rand = new Random();
	private Integer code = rand.nextInt(10000000);
	
    private String codigo = code.toString();
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
