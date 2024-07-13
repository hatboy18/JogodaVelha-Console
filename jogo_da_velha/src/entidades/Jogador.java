package entidades;

import java.util.Scanner;

public class Jogador {
	
	private char tipo ;
	private Scanner sc = new Scanner(System.in);
	
	public Jogador(char tipo) {
		this.tipo = tipo;
	}	
	
	public char getTipo() {
		return tipo;
	}

	
	//Funções que são os inputs do jogador 
	//Player input functions
	public int Coluna() {
		System.out.println("Digite a coluna");
		int coluna = sc.nextInt();
		return coluna;
	}
	public int Linhas() {
		System.out.println("Digite a linha");
		int linha = sc.nextInt();
		return linha;
		
	}
	
	

	
}