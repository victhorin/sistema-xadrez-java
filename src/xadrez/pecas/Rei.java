package xadrez.pecas;

import jogoTabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);

	}

	@Override

	public String toString() {
		return "R";
	}
}
