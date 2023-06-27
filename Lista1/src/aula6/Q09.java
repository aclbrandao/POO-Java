/*9)Elabore um programa que leia o peso e a altura de um adulto e mostre sua
condição de acordo com a tabela abaixo.*/

package aula6;

import java.util.Scanner;

public class Q09 {

	Scanner input;
	double peso, altura, imc;

	public Q09() {
		input = new Scanner(System.in);
	}

	public void setPeso() {
		System.out.println("Digite o seu peso: ");
		this.peso = input.nextDouble();
	}

	public void setAltura() {
		System.out.println("Agora, digite sua altura: ");
		this.altura = input.nextDouble();
	}
	
	public void calculaIMC() {
		imc = peso/(altura*altura);
		System.out.println("Valor IMC: "+ this.imc);
	}
	
	public void situacaoIMC () {
		if (imc <= 18.5) {
			System.out.println("Situação: Abaixo do peso.");
		} else if (imc <= 25) {
			System.out.println("Situação: Peso normal.");
		} else if (imc <= 30) {
			System.out.println("Situação: Acima do peso.");
		} else if (imc > 30) {
			System.out.println("Situação: Obeso.");
		}
	}

	public static void main(String[] args) {
		Q09 imc = new Q09();

		imc.setPeso();
		imc.setAltura();
		imc.calculaIMC();
		imc.situacaoIMC();
	}
}