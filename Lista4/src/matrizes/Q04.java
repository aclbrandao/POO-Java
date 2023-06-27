/*Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá *PAREI AQUI:* fazer
uma busca desse valor na matriz e, ao final, escrever a localização (linha e
coluna) ou uma mensagem de “não encontrado”.*/

package matrizes;

import java.util.Scanner;

public class Q04 {

	int matriz[][] = new int[5][5];
	int valorX, maiorColuna, maiorLinha;
	Scanner input = new Scanner(System.in);

	public void leituraValores() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite um inteiro para carregar a matriz: ");
				matriz[i][j] = input.nextInt();
			}
		}

		System.out.println("Pesquise a posicao de um valor na matriz: ");
		valorX = input.nextInt();
	}

	public void imprimeLocalizacao() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (valorX == matriz[i][j]) {
					maiorLinha = i + 1;
					maiorColuna = j + 1;
					System.out.println("Localizacao: " + "\n" + "Linha: " + maiorLinha 
							+ "\n" + "Coluna: " + maiorColuna);
				} 
			}
		}
		

	}

}
