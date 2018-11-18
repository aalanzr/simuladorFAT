package fat;

public class Bloco extends Fat {
	
	private int tamanho;
	private int posicao;
	private Bloco proximo;
	
	//Cria o bloco
	public Bloco(int posicao, int tamanho, Bloco proximo) {
		this.posicao = posicao;
		this.tamanho = tamanho;
		this.proximo = proximo;
	}
	
	public int calcularBlocos() {
		
		
		return 0;
	}
	
}
