package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
	private int temporadas;
	private boolean ativa;
	private int episodiosPorTemporada;
	private int minutosPorEpisodio;
	
	public int getTemporadas() {
		return temporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	@Override
	public int getDuracaoEmMinutos() {
		// TODO Auto-generated method stub
		/*Neste exemplo, estou utiizando um metodo da classe super (mae) Titulo, para retornar outra informacao, que nao é da classe super*/
		return temporadas * episodiosPorTemporada*minutosPorEpisodio;
	}
	
	
	
	
	

}
