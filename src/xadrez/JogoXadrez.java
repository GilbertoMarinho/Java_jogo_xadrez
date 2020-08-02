package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.PecaXadrez;

//Classe onde devem ficar as regras do jogo
public class JogoXadrez {
	private Tabuleiro tabuleiro;

	
	public JogoXadrez() {
		// Usando construtor de tabuleito com qtdLinha e qtdColuna
		tabuleiro = new Tabuleiro(8,8);
	}
	
	
	// Devolve uma matriz com as peças de xadrez posicionadas no tabuleiro
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] px = new PecaXadrez[tabuleiro.getQtdLinhas()][tabuleiro.getQtdColunas()];
		for(int i=0; i<tabuleiro.getQtdLinhas(); i++) {
			for(int j=0; j<tabuleiro.getQtdColunas(); j++ ) {
				//tabuleiro.peca(x,y) devolve um objeto peça
				//precisamos fazer um downcasting de Peca em PecaXadrez
				px[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return px;
	}
	
	
	
	
	
	
}
