package br.ufrpe.bcc.so.gerenc_e_s.bean;

public class Bloco {
	private int numero;
	private int distOrig;
	
	public Bloco(int numero, int distOrig) {
		this.numero = numero;
		this.distOrig = distOrig;
	}
	
	public Bloco() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return this.numero;
	}
	
	public int distOrig() {
		return this.distOrig;
	}
}
