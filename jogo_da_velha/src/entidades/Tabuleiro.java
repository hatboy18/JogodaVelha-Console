package entidades;
public class Tabuleiro {
	
	private char[][] tabu = {
		{'.','.','.'},
		{'.','.','.'},
		{'.','.','.'}
	};
	
	public void NovoJogo() {
		char [][] tabu = {
			{'.','.','.'},
			{'.','.','.'},
			{'.','.','.'}
		};
		this.tabu = tabu;
	}
	
	
	public void Mostrar() {
		for(char[]n:this.tabu) {
			for(char i:n) {
				System.out.print("|" + " " + i + " " + "|") ;
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//Função que checa os padrões de vitória no jogo e retorna se o jogador venceu ou não
	//Function that checks winning patterns in the game and returns whether the player won or not
	public boolean Checagem(Jogador tipo) {
		
		 if (this.tabu[0][0] == tipo.getTipo()  && this.tabu[1][1] == tipo.getTipo() && this.tabu[2][2] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[0][0] == tipo.getTipo() && this.tabu[0][1] == tipo.getTipo() && this.tabu[0][2] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[0][0] == tipo.getTipo() && this.tabu[1][0] == tipo.getTipo() && this.tabu[2][0] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[1][0] == tipo.getTipo() && this.tabu[1][1] == tipo.getTipo() && this.tabu[1][2] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[2][0] == tipo.getTipo() && this.tabu[2][1] == tipo.getTipo() && this.tabu[2][2] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[0][1] == tipo.getTipo() && this.tabu[1][1] == tipo.getTipo() && this.tabu[2][1] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[0][2] == tipo.getTipo() && this.tabu[1][2] == tipo.getTipo() && this.tabu[2][2] == tipo.getTipo()) {
		        return false;
		    } else if (this.tabu[0][2] == tipo.getTipo() && this.tabu[1][1] == tipo.getTipo() && this.tabu[2][0] == tipo.getTipo()) {
		        return false;
		    } else {
		        return true;
		    }

			
	}
	
	//Função que valida a jogada do jogador caso ele jogue em uma casa na qual ja tenha algum caractere irá perder a rodada
	//Function that validates the player's move if he plays on a square in which there is already a character, he will lose the round
	public void Validar(Jogador tipo, int coluna, int linha) {
		
		if(linha > 2 || coluna > 2 || this.tabu[linha][coluna] == tipo.getTipo()) {
			System.out.println("Casa inválida perdeu a vez bocó");
			
		}else {
			this.tabu[linha][coluna] = tipo.getTipo();
		}
		
	}


}
