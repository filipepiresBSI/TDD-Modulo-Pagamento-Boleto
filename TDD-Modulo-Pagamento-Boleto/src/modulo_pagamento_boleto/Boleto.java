package modulo_pagamento_boleto;

import java.util.Calendar;
import java.util.Random;

public class Boleto {
	
	private Random rand = new Random();
	private Integer code = rand.nextInt(10000000);
	
	private Calendar c = Calendar.getInstance();
	
    private String codigo = code.toString();
    private String data = "12/10/2020";
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
