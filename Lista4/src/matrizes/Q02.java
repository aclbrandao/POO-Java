/*Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. 
  Escreva ao final a matriz obtida.*/

package matrizes;

public class Q02 {

	int matriz[][] = new int[5][5];

	public void carregaMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0;
				if (i == j) {
					matriz[i][j] = 1;
				}
			}
		}

	}

	public void imprimeMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");

		}

	}

}
