/*Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de
cada posição das matrizes lidas.*/

package matrizes;

import java.util.Scanner;

public class Q05 {

	int matriz1[][] = new int[4][4];
	int matriz2[][] = new int[4][4];
	int matriz3[][] = new int[4][4];
	Scanner input = new Scanner(System.in);

	public void carregaMatriz1() {
		System.out.println("Vamos carregar a primeira matriz!");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println("Digite o valor da posicao [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz1[i][j] = input.nextInt();

			}
		}
	}

	public void carregaMatriz2() {

		System.out.println("Agora, vamos carregar a segunda matriz!");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.println("Digite  o valor da posicao [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz2[i][j] = input.nextInt();

			}

		}
	}

	public void carregaTres() {

		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3.length; j++) {
				matriz3[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
			}
		}
		System.out.println("-----------------------------------");

		System.out.println("A matriz com os maiores valores é:");

		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3.length; j++) {
				System.out.print("[" + matriz3[i][j] + "] ");
			}
			System.out.println();
		}
	}

}
