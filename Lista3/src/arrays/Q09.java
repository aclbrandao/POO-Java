/*Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se
encontram o maior e o menor valor.*/

package arrays;

import java.util.Scanner;

public class Q09 {
	private double valores[] = new double[5];
	Scanner input = new Scanner(System.in);
	private double maiorValor, menorValor = 1000000000000000.0;
	private int posicaoMaior, posicaoMenor ;

	public void carregaVetor() {
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor: ");
			valores[i] = input.nextDouble();

			if (valores[i] >= maiorValor) {
				maiorValor = valores[i];
				posicaoMaior = i + 1;

			}

			if (valores[i] < menorValor) {
				menorValor = valores[i];
				posicaoMenor = i + 1;

			}
		}

		System.out.println("---------------------------------");

	}

	public void imprimePosicoes() {

		System.out.println("Posicao do maior valor: " + posicaoMaior);

		System.out.println("Posicao do menor valor: " + posicaoMenor);
	}

}
