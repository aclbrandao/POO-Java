/*Implemente um programa que leia um numero n˜ao determinado de valores e calcule e escreva
a media aritmetica dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos.*/

package aula8;

import java.util.*;

public class Q03 {
	double n = 1.0;
	double soma, cont,media, percentualNegativos, percentualPositivos;
	int valorPositivo, valorNegativo;

	public void leituraNumeros() {
		Scanner input1 = new Scanner(System.in);

		while (n != 0) {
			System.out.println("Insira um valor ou 0 (zero) para parar o programa: ");
			n = input1.nextDouble();

			if (n == 0) {
				break;
			}
			if (n >= 1) {
				valorPositivo += 1;
			} else {
				valorNegativo += 1;
			}
			soma += n;
			cont ++;

		}

	}

	public void calculaEMostraMedia() {
		media = soma / cont;
		System.out.println("A media dos numeros inseridos e: " + media);

	}

	public void quatidadePositivos() {
		System.out.println("Quatidade de valores positivos inseridos: " + valorPositivo);

	}

	public void quatidadeNegativos() {
		System.out.println("Quatidade de valores negativos inseridos: " + valorNegativo);

	}
	
	
	public void percentagemNegativos() {
		percentualNegativos = valorNegativo / cont;
		System.out.println("Percentual de números negativos: " + percentualNegativos);

	}

	
	public void percentagemPositivos() {
		percentualPositivos = valorPositivo / cont;
		System.out.println(percentualPositivos);

	}

}
