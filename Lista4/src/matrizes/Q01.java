package matrizes;

//Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
import java.util.*;

public class Q01 {
	double[][] matriz = new double[4][4];
	int quantidade;
	Scanner input = new Scanner(System.in);

	public void leituraDados() {
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				System.out.printf(" Digite o valor da linha %d coluna %d >", (i + 1), (j + 1));
				matriz[i][j] = input.nextDouble();

				if (matriz[i][j] > 10) {
					quantidade++;
				}
			}
		}

	}

	public void imprimeQuantidade() {
		System.out.println("Quantidade de valores maiores que 10: " + quantidade);
	}

}
