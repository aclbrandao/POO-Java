/*3) Faça um programa para receber um número qualquer e informar na tela se é par ou
ímpar.*/

package aula6;

import java.util.Scanner;

public class Q03 {
	
	private void calculo(double n){
		if ((n%2 )== 0.0) {
			System.out.println("O numero inserido e par!");
		} else {
			System.out.println("O numero acima inserido e impar!");
		}
	}
	
	public static void main(String[] args) {
		
		Q03 numeros = new Q03();
		
		Scanner input = new Scanner (System.in);
				
		double n;
		
		System.out.println("Insira um número para saber se ele é par ou ímpar: ");
		n = input.nextDouble();
		
		numeros.calculo(n);	
	}	
}
