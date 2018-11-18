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
		if (tamanhoDisco % tamanhoBloco != 0) {
			System.out.println("Tamanho do bloco incompatível com o tamanho do disco!");
		} else {
		}
			System.out.println("tamanho ok"); //remover está apenas para teste
			totalBlocos = tamanhoDisco % tamanhoBloco;
			return tbFat = new int[totalBlocos];
	}
	
	public void imprimeFat() {
		
		System.out.println("Total de Blocos do disco: ");
		System.out.println("Blocos ocupados: ");
		System.out.println("Memoria Ocupada (Bytes): ");
		System.out.println("Blocos Livres: ");
		System.out.println("Memoria Livre (Bytes): ");
		
		for (int i = 0; i <= tbFat.length; i++) {
			System.out.println(tbFat[i]);
		}
	}
}
