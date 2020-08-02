package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
	private Cor cor;

	
	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		//reutilizando construtor da superclasse Peca
		super(tabuleiro);
		this.cor = cor;
	}


	public Cor getCor() {
		return cor;
	}
}
