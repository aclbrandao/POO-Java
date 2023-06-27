/*Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os
valores lidos na ordem inversa*/
package arrays;

import java.util.*;

public class Q06 {

	int insecta[] = new int[6];
	Scanner input = new Scanner(System.in);
	
	public void leEImprime() {
		
		for (int i=0; i < insecta.length; i++) {
			int indice = i + 1;
			System.out.println("Digite o " + indice + "o valor:");
			insecta[i] = input.nextInt();
		}
		
		System.out.println("------- Ordem inversa: -------");
	
		for (int c = insecta.length - 1; c >= 0; c--) {
			System.out.print(insecta[c]+"  ");
		}
		
		
	}
	

}
