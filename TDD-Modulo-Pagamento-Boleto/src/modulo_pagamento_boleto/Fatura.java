package modulo_pagamento_boleto;

public class Fatura {
	
	private String nome;
    private String data = "12/10/2020";
    private double valor = 0.00;
	
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

}
