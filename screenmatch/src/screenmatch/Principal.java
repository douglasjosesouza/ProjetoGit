package screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();	
		meuFilme.setNome("Alien o oitavo passageiro");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180); 
		System.out.println("Duracao do filme "+meuFilme.getDuracaoEmMinutos());
		
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10.78);
		meuFilme.avalia(5);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		

		System.out.println("Total de avaliações "+meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());
		
		Serie serie = new Serie();
		serie.setNome("O resgate do soldado Rian");
		serie.setAnoDeLancamento(2000);
		serie.exibeFichaTecnica();
		serie.setTemporadas(10);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(50);
		System.out.println("Duração do filme..." + serie.getDuracaoEmMinutos());
		

	}

}
