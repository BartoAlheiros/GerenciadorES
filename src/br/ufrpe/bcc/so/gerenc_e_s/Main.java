package br.ufrpe.bcc.so.gerenc_e_s;

import java.util.ArrayList;

import br.ufrpe.bcc.so.gerenc_e_s.bean.Cilindro;
import br.ufrpe.bcc.so.gerenc_e_s.bean.DiskArmSchedSimulator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		DiskArmSchedSimulator simu = new DiskArmSchedSimulator();
		Cilindro c = new Cilindro(40);
		int[] posicoes = c.getPosicoes();
		ArrayList<Integer> posReq = new ArrayList<>();
		int[] posic = {98,183,37,122,14,124,65,67};
		for (int i = 0; i < posic.length; i++) {
			posReq.add(posic[i]);
		}
		simu.sstf(posReq, 53);
//		for (int i = 0; i < posicoes.length; i++) {
//			System.out.println(posicoes[i]);
//		}
		
		
	}

}
