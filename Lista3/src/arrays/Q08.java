/*Faça um programa que preencha um vetor com 10 números reais, calcule e
mostre a quantidade de números negativos e a soma dos números positivos desse
vetor.*/
package arrays;

import java.util.Scanner;

public class Q08 {
	double vetor[] = new double[10];
	double soma;
	int quantidadeNegativos;
	Scanner input = new Scanner(System.in);

	public void leituraNumeros() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero real: ");
			vetor[i] = input.nextDouble();

			if (vetor[i] < 0) {
				quantidadeNegativos++;
			} else {
				soma += vetor[i];
			}

		}

	}

	public void imprimeNegativos() {
		System.out.println("---------------------------------");
		System.out.println("Quantidade de numeros negativos: "+quantidadeNegativos);
	}

	public void imprimeSoma() {
		System.out.println("---------------------------------");
		System.out.println("Soma de numeros positivos: "+soma);
	}

}
