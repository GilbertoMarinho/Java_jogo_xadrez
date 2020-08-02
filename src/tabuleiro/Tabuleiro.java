package tabuleiro;

public class Tabuleiro {
	private int qtdLinhas;
	private int qtdColunas;
	//Um tabuleiro possio várias peças
	private Peca[][] pecas;
	
	
	
	public Tabuleiro(int qtdLinhas, int qtdColunas) {
		this.qtdLinhas = qtdLinhas;
		this.qtdColunas = qtdColunas;
		pecas = new Peca[qtdLinhas][qtdColunas];
	}



	public int getQtdLinhas() {
		return qtdLinhas;
	}
	public void setQtdLinhas(int qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}
	public int getQtdColunas() {
		return qtdColunas;
	}
	public void setQtdColunas(int qtdColunas) {
		this.qtdColunas = qtdColunas;
	}
	
	// retorna uma peca no tabuleiro a partir da posicao de linha e coluna
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	//Sobrecarga do método peca
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	
	
}
