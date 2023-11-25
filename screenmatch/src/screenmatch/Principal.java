package screenmatch;

import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();	
		meuFilme.setNome("Alien o oitavo passageiro");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180); 
		
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10.78);
		meuFilme.avalia(5);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		

		System.out.println("Total de avaliações "+meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());

	}

}
