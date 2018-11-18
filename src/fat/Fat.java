package fat;

public class Fat {
	
	private int tamanhoDisco;
	private int tamanhoBloco;
	private int totalBlocos;
	private int [] tbFat;
	
	
	public int getTamanhoDisco() {
		return tamanhoDisco;
	}
	public void setTamanhoDisco(int tamanhoDisco) {
		this.tamanhoDisco = tamanhoDisco;
	}
	public int getTamanhoBloco() {
		return tamanhoBloco;
	}
	public void setTamanhoBloco(int tamanhoBloco) {
		this.tamanhoBloco = tamanhoBloco;
	}
	public int getTotalBlocos() {
		return totalBlocos;
	}
	public void setTotalBlocos(int totalBlocos) {
		this.totalBlocos = totalBlocos;
	}
	public int[] getTbFat() {
		return tbFat;
	}
	public void setTbFat(int[] tbFat) {
		this.tbFat = tbFat;
	}
	
	public int[] inicializarFat(int tamanhoDisco, int tamanhoBloco) {

		if ((tamanhoDisco % tamanhoBloco) != 0) {
			System.out.println("Tamanho do bloco incompatível com o tamanho do disco! Digite um valor compatível! ");
			System.out.println();
		} else {
			totalBlocos = (tamanhoDisco / tamanhoBloco);
			tbFat = new int[totalBlocos];
		}
//		for (int i = 0; i < tbFat.length; i++) {
//			tbFat[i] = 'x';
//		}
		return tbFat;
	}
	
	public void imprimeFat() {
		
		System.out.println("Total de Blocos do disco: " + totalBlocos);
		System.out.println("Blocos ocupados: ");
		System.out.println("Memoria Ocupada (Bytes): ");
		System.out.println("Blocos Livres: ");
		System.out.println("Memoria Livre (Bytes): ");
		System.out.println();
		System.out.println("Mapeamento de Blocos FAT");
		System.out.println("End. " + " " + "Encadeamento");

		for (int i = 0; i < tbFat.length; i++) {
			System.out.println(i + "         " + tbFat[i]);
		}
		System.out.println();
	}
}
