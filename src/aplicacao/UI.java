package aplicacao;

import xadrez.PecaXadrez;

public class UI {

	public static void printTabuleiro(PecaXadrez[][] px) {
		for(int i = 0; i < px.length; i++ ) {
			//imprimindo legendas de linhas
			System.out.print((8 - i)+" ");
			for(int j = 0; j < px.length; j++ ) {
				printPeca(px[i][j]);
			}
			System.out.println();
		}
		//legenda de coluna
		System.out.println("  a b c d e f g h");
	}
	
	
	//imprimi uma peca, ou uma casa vazia
	private static void printPeca(PecaXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
	
}
