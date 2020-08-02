package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

//Classe onde devem ficar as regras do jogo
public class JogoXadrez {
	private Tabuleiro tabuleiro;

	
	public JogoXadrez() {
		// instanciando um objeto tabuleiro tabuleiro com qtdLinha e qtdColuna
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
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
	
	
	private void configuracaoInicial(){
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7,0));
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7,7));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7,4));
		
		
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(0,0));
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(0,7));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
	}
	
	
	
}
