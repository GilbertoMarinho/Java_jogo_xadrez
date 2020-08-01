package tabuleiro;

public class Peca {
	
	//Posição não deve ser acessada fora do package tabuleiro
	protected Posicao posicao;
	//Uma peça possui um tabuleiro; n peca ------- 1 tabuleiro 
	private Tabuleiro tabuleiro;
	
	
	//Um objeto Peca deve ser instanciado com posica null
	//pois uma peca recém criada ainda não foi colocada no tabuleiro
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


	
	
	
}
