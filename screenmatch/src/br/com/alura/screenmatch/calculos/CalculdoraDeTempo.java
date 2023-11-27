package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculdoraDeTempo {
	
	private int tempoTotal = 0;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
	
	
	public void inclui(Filme f) {
		tempoTotal += f.getDuracaoEmMinutos();
	}

}
