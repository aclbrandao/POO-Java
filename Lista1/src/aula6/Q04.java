/*4) Faça um programa que leia dois valores inteiros A e B se os valores forem iguais deverá se
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos
deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.*/

package aula6;

import java.util.Scanner;

public class Q04 {

	private int C;

	public void somaIguais(int A, int B) {
		if (A == B) {
			this.C = A + B;
			System.out.println("Soma dos numeros: "+ this.C); 
		} else {
			this.C = A * B;
			System.out.println("Multiplicacao entre os numeros: "+ this.C);
		}
	}
	
	public static void main(String[] args) {

		Q04 calculo = new Q04();	
		
		int A;
		int B;

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro valor: ");
		A = input.nextInt();

		System.out.println("Insira o segundo valor: ");
		B = input.nextInt();
		
		calculo.somaIguais(A, B);

	}
}
