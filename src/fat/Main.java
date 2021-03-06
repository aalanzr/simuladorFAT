package fat;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		Fat fat = new Fat();
		scanner = new Scanner(System.in);
		int opt;
		boolean fatInvalido;
		
		do {
			System.out.println("Digite o tamanho do disco em Bytes");
			int tamDisco = scanner.nextInt();
			System.out.println("Digite tamanho do bloco");
			int tamBloco = scanner.nextInt();
			
			if (fat.inicializarFat(tamDisco, tamBloco) == null) {
				fatInvalido = false;
			} else {
				fatInvalido = true;
			}		
		} while(!fatInvalido);
		
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println();
		
		do {
			
			System.out.println("[1] - Criar Arquivo");
			System.out.println("[2] - Remover Arquivo");
			System.out.println("[3] - Imprimir FAT");
			System.out.println("[0] - Sair");
			opt = scanner.nextInt();
			
			switch (opt) {
			case 1:
				System.out.println("Digite o nome do Arquivo: ");
				String nomeArq = scanner.nextLine();
				System.out.println("Digite o tamanho do arquivo: ");
				int tamArq = scanner.nextInt();
				
				
				break;
				
			case 2:
				break;
				
			case 3:
				fat.imprimeFat();
				break;
				
			case 0:
				System.out.println("Saindo...");
				System.out.println();
				System.exit(0);
				break;
				
			default:
				System.out.println("Op��o invalida! ");
				System.out.println();
			}			
		} while (opt != 0);
	}
}
