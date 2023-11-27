package br.com.dsystem.conta;

public class Conta {

	private String titular;
	private double saldo;
	
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getSaldo() {
		return saldo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public double sacar(double valor) {
		if (valor <=0) {
			System.out.println("Valor deve ser maior que zero");
		}else if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Saldo insuficiente...");
		}
		double res = getSaldo()-valor;
		return res;
	}
	
	
}
