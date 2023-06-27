/*2. Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa devera 
calcular e mostrar: a menor altura do grupo e maior .
*/

package aula8;

import java.util.*;

public class Q02 {
	

	double altura;
	double menorAltura = 15;
	double maiorAltura;
	
	public void leituraECalculoAlturas() {
		int i;
		
		
		for (i = 1; i <= 3; i ++) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Insira a altura: ");
			this.altura = input.nextDouble();	
			
			if (altura > maiorAltura) 
			{
				maiorAltura = altura;
			}
			
			if  (altura < menorAltura)
			{
				menorAltura=altura;
			}
		} 
		
		
	}
	
	
	public void mostraMenorAltura () {
		System.out.println("Menor altura: " + menorAltura);
		
	}
	
	public void mostraMaiorAltura () {
		System.out.println("Maior altura: " + maiorAltura);
		
	}

}
