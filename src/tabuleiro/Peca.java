package tabuleiro;

public class Peca {
	
	//Posi��o n�o deve ser acessada fora do package tabuleiro
	protected Posicao posicao;
	//Uma pe�a possui um tabuleiro; n peca ------- 1 tabuleiro 
	private Tabuleiro tabuleiro;
	
	
	//Um objeto Peca deve ser instanciado com posica null
	//pois uma peca rec�m criada ainda n�o foi colocada no tabuleiro
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


	
	
	
}
