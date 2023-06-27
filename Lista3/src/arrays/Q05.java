/*Escreva um programa que leia 10 números inteiros e os armazene em um vetor.
Imprima o vetor, o maior elemento e a posição que ele se encontra.
*/
package arrays;

import java.util.Scanner;

public class Q05 {

	int acucar[] = new int[10];
	int maiorElemento, posicao;
	Scanner input = new Scanner(System.in);

	public void leituraAcucar() {
		for (int i = 0; i < acucar.length; i++) {
			System.out.println("Digite um numero inteiro: ");
			acucar[i] = input.nextInt();

			if (acucar[i] > maiorElemento) {
				maiorElemento = acucar[i];
				posicao = i + 1;
			}

		}
		System.out.println("-----------------------------------");

	}

	public void imprimeECompara() {
		System.out.println("Os numeros carregados no vetor foram:");
		for (int a : acucar) {
			System.out.print(a + "  ");
		}

		System.out.println("\nMaior elemento: " + maiorElemento);

		System.out.println("Posicao do maior elemento: " + posicao);
	}

}
