/*Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva:*/

package matrizes;

import java.util.Scanner;

public class Q06 {
	double matriz[][] = new double[5][5];
	double somaImpar, somaLinha1, somaLinha2, somaLinha3, somaLinha4, somaLinha5;
	double somaColuna1, somaColuna2, somaColuna3, somaColuna4, somaColuna5;
	Scanner input = new Scanner(System.in);

	public void leituraMatriz() {
		System.out.println("Vamos carregar a primeira matriz!");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o valor da posicao [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = input.nextInt();

				// soma dos números ímpares fornecidos:
				if (matriz[i][j] % 2 != 0) {
					somaImpar += matriz[i][j];

				}

			}
		}

	}

	public void somaImpares() {
		System.out.println("-----------------------------------");
		System.out.println("Soma dos valores impares: " + somaImpar);

	}

	// soma de cada uma das 5 colunas:
	public void somaLinhas() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < matriz.length; j++) {
				somaLinha1 += matriz[i][j];
			}

		}

		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < matriz.length; j++) {
				somaLinha2 += matriz[i][j];
			}

		}

		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < matriz.length; j++) {
				somaLinha3 += matriz[i][j];
			}

		}

		for (int i = 3; i < 4; i++) {
			for (int j = 0; j < matriz.length; j++) {
				somaLinha4 += matriz[i][j];
			}

		}

		for (int i = 4; i < 5; i++) {
			for (int j = 0; j < matriz.length; j++) {
				somaLinha5 += matriz[i][j];
			}

		}

		System.out.println("-----------------------------------");
		System.out.println("Soma dos valores");
		System.out.println("Linha 1: " + somaLinha1);
		System.out.println("Linha 2: " + somaLinha2);
		System.out.println("Linha 3: " + somaLinha3);
		System.out.println("Linha 4: " + somaLinha4);
		System.out.println("Linha 5: " + somaLinha5);

	}

	public void somaColunas() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 1; j++) {
				somaColuna1 += matriz[i][j];
			}

		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 1; j < 2; j++) {
				somaColuna2 += matriz[i][j];
			}

		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 2; j < 3; j++) {
				somaColuna3 += matriz[i][j];
			}

		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 3; j < 4; j++) {
				somaColuna4 += matriz[i][j];
			}

		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 4; j < 5; j++) {
				somaColuna5 += matriz[i][j];
			}

		}

		System.out.println("-----------------------------------");
		System.out.println("Soma dos valores");
		System.out.println("Coluna 1: " + somaColuna1);
		System.out.println("Coluna 2: " + somaColuna2);
		System.out.println("Coluna 3: " + somaColuna3);
		System.out.println("Coluna 4: " + somaColuna4);
		System.out.println("Coluna 5: " + somaColuna5);

	}
}
