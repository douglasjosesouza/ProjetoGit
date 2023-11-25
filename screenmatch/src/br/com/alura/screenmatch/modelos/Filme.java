package br.com.alura.screenmatch.modelos;

public class Filme {
	private String nome;//String, não é considerada um tipo primitivo, mas sim um Class
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	


	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}



	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}



	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	
	


	public String getNome() {
		return nome;
	}



	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}



	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}



	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}



	public void exibeFichaTecnica() {
		System.out.println("Nome do Filme é, " + nome + " ano de lançamento " + anoDeLancamento);		
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes ++;//aqui esta sendo iterado, para cada vez que o metodo avalia receber um parametro com o valor, é somado em totalDeAvalicaoes
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes/totalDeAvaliacoes;
	}
	
	
	
}
