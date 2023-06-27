/* Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e 
 * a coluna) do maior valor. */

package matrizes;

import java.util.Scanner;

public class Q03 {

	int matriz[][] = new int[4][4];
	int maiorValor = -999999999;
	int maiorColuna, maiorLinha;
	Scanner input = new Scanner(System.in);

	public void carregaMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite um valor inteiro: ");
				matriz[i][j] = input.nextInt();

				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					maiorLinha = i + 1;
					maiorColuna = j + 1;

				}

			}

		}
	}

	public void imprimeMaior() {
		System.out.println("Maior valor da matriz: " + maiorValor);
		System.out.println("Linha: " + maiorLinha);
		System.out.println("Coluna: " + maiorColuna);

	}
}
