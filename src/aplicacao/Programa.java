package aplicacao;

import xadrez.JogoXadrez;

public class Programa {

	public static void main(String[] args) {
		JogoXadrez jogo = new JogoXadrez();
		
		UI.printTabuleiro(jogo.getPecas());
	}
}
