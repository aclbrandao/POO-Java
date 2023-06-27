/*Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor,
calcule e imprima a média geral*/
package arrays;

import java.util.Scanner;

public class Q07 {

	double notas[] = new double[15];
	double soma, media;
	Scanner input = new Scanner(System.in);

	public void leituraNotas() {
		int indice = notas.length + 1;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + indice + "a nota: ");
			notas[i] = input.nextDouble();
			soma += notas[i];

		}
		System.out.println("-----------------------------------");
	}

	public void calculaMedia() {
		media = soma / notas.length;
		System.out.println("Media geral: " + media);
	}

}
