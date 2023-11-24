package screenmatch;

public class Filme {
	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
	void exibeFichaTecnica() {
		System.out.println("Nome do Filme é, " + nome + " ano de lançamento " + anoDeLancamento);		
	}
	
	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes ++;//aqui esta sendo iterado, para cada vez que o metodo avalia receber um parametro com o valor, é somado em totalDeAvalicaoes
	}
	
	double pegaMedia() {
		return somaDasAvaliacoes/totalDeAvaliacoes;
	}
	
}
