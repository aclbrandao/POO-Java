/*Implemente um programa que leia uma quantidade n˜ao determinada 
 * de numeros positivos. Calcule a quantidade de numeros pares
 * e ımpares, a media de valores pares e a media geral dos 
 * numeros lidos. O numero que encerrara a leitura sera zero.*/

package aula8;

import java.util.*;

public class Q05 {

	double n = 1.0;
	double somaTotal, somaPares, mediaTotal, mediaPares;
	int numerosPares, numerosImpares, contTotal, contPares, quatidadeImpares;

	public void leituraNumeros() {

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		while (n != 0) {
			System.out.println("Digite um numero POSITIVO ou 0 (zero) para parar o programa: ");
			n = input1.nextDouble();

			// leia numeros positivos:
			if (n > 0) {

				somaTotal += n;

				// Calcule a quantidade de numeros pares e ımpares
				if (n % 2 == 0) {
					numerosPares += 1;
					somaPares += n;
					contPares += 1;
				} else {
					numerosImpares += 1;
				}
				contTotal += 1;

			} else {
				if (n == 0) {
					System.out.println("--------- Resultados ---------");
					System.out.println("");
				}
				if (n < 0) {
					System.out.println("Erro: você digitou um numero negativo.");
					System.out.println("");
				}

			}
		}

	}

	public void quatidadeParesImpares() {
		quatidadeImpares = contTotal - contPares;
		System.out.println("- Quantidades: ");
		System.out.println("Quantidade de numeros pares: " + contPares);
		System.out.println("Quantidade de numeros impares: " + quatidadeImpares);
		System.out.println("");
	}

	public void mediaPares() {
		System.out.println("- Medias: ");
		mediaPares = somaPares / contPares;
		System.out.println("Media de valores pares " + mediaPares);
		

	}

	public void mediaTotal() {
		mediaTotal = somaTotal / contTotal;
		System.out.println("Media geral dos numeros lidos " + mediaTotal);
	}

}
