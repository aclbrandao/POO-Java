//Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.

package arrays;

import java.util.Scanner;

public class Q02 {

	int[] valores = new int[6];
	Scanner input = new Scanner(System.in);

	public void leituraValores() {

		for (int i = 0; i < valores.length; i++) {
			int indice = i + 1;
			System.out.println("Digite o " + indice + "o valor:");
			valores[(int) i] = input.nextInt();
		}
		System.out.println("-----------------------------------");
	}

	public void imprimeValores() {
		System.out.println("Valores do array: ");

		for (int v : valores) {
			System.out.print(v + "  ");
		}

	}

}
