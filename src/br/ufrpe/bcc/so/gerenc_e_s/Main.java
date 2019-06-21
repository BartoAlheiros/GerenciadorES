package br.ufrpe.bcc.so.gerenc_e_s;

import java.util.ArrayList;
import java.util.Arrays;

import br.ufrpe.bcc.so.gerenc_e_s.bean.Cilindro;
import br.ufrpe.bcc.so.gerenc_e_s.bean.DiskArmSchedSimulator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		DiskArmSchedSimulator simu = new DiskArmSchedSimulator();
//		Cilindro c = new Cilindro(40);
//		int[] posicoes = c.getPosicoes();
		
		/*** OK ***/
		/* Printa as posicões do vetor do Cilindro */
//		for (int i = 0; i < posicoes.length; i++) {
//			System.out.println(posicoes[i]);
//		}
		
		ArrayList<Integer> posReq = new ArrayList<>();
//		int[] posic = {98,183,37,122,14,124,65,67};
		int[] posicVisit2 = {1,9,12,16,34,36};
		
//		for (int i = 0; i < posic.length; i++) {
//			posReq.add(posic[i]);
//		}
		
		for (int i = 0; i < posicVisit2.length; i++) {
			posReq.add(posicVisit2[i]);
		}
		
		System.out.println("posicoes a serem visitadas" + Arrays.toString(posReq.toArray()));
//		simu.sstf(posReq, 53);
		simu.elevadorLook(posReq, 27);
		
	}

}
