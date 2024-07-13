package jogo;

import java.util.Scanner;

import entidades.Jogador;
import entidades.Tabuleiro;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jogador jogX = new Jogador('X');
		Jogador jogO = new Jogador('O');
		
		int linha,coluna,jogarNovamente;
		
		
		boolean cont;
		Tabuleiro tableiro = new Tabuleiro();
		do {
			tableiro.NovoJogo();
			tableiro.Mostrar();
			for(int i = 0; i < 9;){
				
				System.out.println("Vez do jogador X");
				linha = jogX.Linhas();
				coluna = jogX.Coluna();
				tableiro.Validar(jogX, coluna, linha);
				cont = tableiro.Checagem(jogX);
				tableiro.Mostrar();
				i++;
				if(cont == false) {
					System.out.println("Vitoria X");
					break;
				}
				
				System.out.println("Vez do jogador O");
				linha = jogO.Linhas();
				coluna = jogO.Coluna();
				tableiro.Validar(jogO, coluna, linha);
				cont = tableiro.Checagem(jogO);			
				tableiro.Mostrar();
				i++;
				if(cont == false) {
					System.out.println("Vitoria O");
					break;
				}
				
				if (i == 8) {
					System.out.println("Empate");
					break;
				}
			}
			System.out.println("Deseja jogar novamente? (1)Sim (2)Não");
			jogarNovamente = sc.nextInt();
		
		}while(jogarNovamente == 1);
		sc.close();
	}
}
