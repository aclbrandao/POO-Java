/*Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele
possui.*/
package arrays;

import java.util.*;

public class Q04 {
	double[] vetor = new double[10];
	int quantidadePares;
	double[] par;
	Scanner input = new Scanner(System.in);

	public void leituraDados() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = input.nextDouble();

			if (vetor[i] % 2 == 0) {
				quantidadePares++;
				
			}

		}

	}

	public void qunatidadePares() {
		System.out.println("Quantidade de pares: "+quantidadePares);

	}

}
