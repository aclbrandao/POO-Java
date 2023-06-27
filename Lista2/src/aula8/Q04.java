/*Implemente um programa que leia uma quantidade desconhecida de numeros e conte quantos deles
est˜ao nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve 
terminar quando for lido um numero negativo.*/

package aula8;

import java.util.Scanner;

public class Q04 {
	double n = 1.0;
	int i1, i2, i3, i4;

	public void leituraNumeros() {
		Scanner input = new Scanner(System.in);

		while (n > 0) {
			System.out.println("Digite um numero positivo ou um numero negativo para parar o programa: ");
			n = input.nextDouble();

			if (n < 0) {
				break;
			}
			if (n <= 25) {
				i1++;
			}
			else if (n <= 50) {
				i2++;
			}
			else if (n <= 75) {
				i3++;
			}
			else  {
				i4++;
			}

		}

	}
	
	public void imprimeIntervalos() {
		System.out.println("\n"+"________ RESULTADO ________");
		System.out.println("Os numeros inseridos estao nos seguintes intervalos:");
		System.out.println("Entre 1 e 25: "+i1 
				+ "\nEntre 26 e 50: " + i2 + "\nEntre 51 e 75: " + i3 + "\nEntre 76 e 100: " + i4 + " ");
	}

}
