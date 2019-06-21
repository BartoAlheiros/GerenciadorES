package br.ufrpe.bcc.so.gerenc_e_s.bean;

import java.util.ArrayList;
import java.util.Arrays;

// Disk Arm Scheduler Simulator with Algorithms
public class DiskArmSchedSimulator {
	
	ArrayList<Integer> distancias = new ArrayList<>();
	
	public void sstf(ArrayList<Integer> positions, int posInit) throws InterruptedException {
		
		ArrayList<Bloco> blocos = new ArrayList<>();
		int menor = 0;
		
		// calcula as distancias e popula no array de distancias
		for (int i = 0; i < positions.size(); i++) {
			Bloco b;
			distancias.add(Math.abs(posInit - positions.get(i)));
			b = new Bloco(positions.get(i), distancias.get(i));
			blocos.add(b);
		}
		
		// ordena a lista de distancias 
		distancias.sort(null);
		
		System.out.println(Arrays.toString(distancias.toArray()));
		for (int i = 0; i < blocos.size(); i++) {
			menor = distancias.get(0);
			Thread.sleep(2000);
			System.out.println("menor distancia eh " + menor);
			visita(blocos, menor);
			System.out.println(Arrays.toString(distancias.toArray()));
		}
		
		System.out.println("Fim da leitura.");
		
		
	}
	
	public void visita(ArrayList<Bloco> blocos, int menor) throws InterruptedException {
		
		for (int i = 0; i < blocos.size(); i++) {
			//System.out.println("posicao " + blocos.get(i).getNumero() + " distancia da origem " + blocos.get(i).distOrig());
			if(blocos.get(i).distOrig() == menor) {
				Thread.sleep(2000);
				System.out.println("Agulha visitando o bloco " + blocos.get(i).getNumero());
				Thread.sleep(menor * 50);
				System.out.println();
				distancias.remove(0);
				break;
			}
		}
		
	
	}
	
	public void elevadorLook(ArrayList<Integer> positions, int posInit) {
		
		ArrayList<Integer> anteriores = new ArrayList<Integer>();
		ArrayList<Integer> posteriores = new ArrayList<Integer>();
		
		// divide as posicões a serem visitadas em anteriores e posteriores ao bloco inicial
		for (int i = 0; i < positions.size(); i++) {
			if (positions.get(i).intValue() < posInit) {
				anteriores.add(positions.get(i));
			} else if(positions.get(i).intValue() > posInit) {
				posteriores.add(positions.get(i));
			}
		}
		
//		System.out.println("ANTERIORES " + Arrays.toString(anteriores.toArray()));
//		System.out.println("POSTERIORES " + Arrays.toString(posteriores.toArray()));
		
		
	}
	
	public void visitaLook() {
		
	}
}
