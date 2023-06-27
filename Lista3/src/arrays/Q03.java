package arrays;

import java.util.Scanner;

public class Q03 {

	double[] numeros;
	double[] numeros2;
	int tamanho;
	Scanner input = new Scanner(System.in);

	// Ler um conjunto de números reais armazenando-o em vetor:
	public void leituraVetor() {
		System.out.print("Digite a quantidade de numeros a serem carregados no vetor: ");
		tamanho = input.nextInt();

		numeros = new double[tamanho];

		for (int i = 0; i < numeros.length; i++) {
			int indice = i + 1;
			System.out.println("Digite o " + indice + "o valor:");
			numeros[i] = input.nextDouble();
		}

	}

	// calcular o quadrado dos componentes deste vetor armazenando o resultado em
	// outro vetor:
	public void calculaQuadrado() {
		numeros2 = new double[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
				numeros2[i] = Math.pow(numeros[i], 2);
			} 

		System.out.println("-----------------------------------");

	}

	// Imprimir ambos os vetores:
	public void imprimeVetores() {
		System.out.println("Vetor carregado: ");
		
		for (double k : numeros) {
			System.out.print(k+"  ");
		}
		
		System.out.println("\n-----------------------------------");
		
		System.out.println("Resultado do quadrado de cada numero: ");

		for (double z : numeros2) {
			System.out.print(z+"  ");
		}
	}

}
