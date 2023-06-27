/*1. Desenvolver um algoritmo que efetue a soma de todos os n´umeros ´ımpares que s˜ao m´ultiplos de
trˆes e que se encontram no conjunto dos n´umeros de 1 at´e 500. */

package aula8;

public class Q01 {
	int soma = 0;

	public void somaImpares () {
		int i;
			
		for (i = 1; i <= 495; i++) {	//de 1 até 495
			 if (i%2 !=0) { 			//se o numero é par
				 if (i %3 == 0){		//se o numero é divisivel por 3
					 soma += i;				
				}
			 }
		}
		
	}
	
	public void devolveSoma() {
		
		System.out.print("Resultado da soma de todos os numeros impares que sao multiplos de tres e \n"
				+ "que se encontram no conjunto dos numeros de 1 ate 500: ");
		System.out.print(soma);
		
	}

}
