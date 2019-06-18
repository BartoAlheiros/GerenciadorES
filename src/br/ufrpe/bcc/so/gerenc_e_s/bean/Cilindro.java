package br.ufrpe.bcc.so.gerenc_e_s.bean;

public class Cilindro {
	private int[] posicoes;
	
	public Cilindro(int tamanho) {
		this.posicoes = new int[tamanho];
		for (int i = 0; i < posicoes.length; i++) {
			this.posicoes[i] = i;
		}
	}
	
	public int[] getPosicoes() {
		return this.posicoes;
	}
	
}
