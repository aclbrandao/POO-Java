/* Escreva um programa que lê dois valores booleanos (lógicos) e então determina se ambos
são VERDADEIROS ou FALSOS.
*/

package aula6;

import java.util.*;

public class Q06 {
	
	public static void verdadeirosOuFalsos(boolean a, boolean b) {
		if (a == true && b == true) {
			System.out.println("ambos sao verdadeiros");
		} else if (a==false && b== false) {
			System.out.println("ambos sao falsos");
		} else {
			System.out.println("tem valores diferentes");
		}
	}
	
	public static void main(String[] args) {
		
		Q06 valores = new Q06();
		
		Scanner input = new Scanner (System.in);
		
		boolean a;
		boolean b;
		
		System.out.println("Insira um valor boleano (true ou false): ");
		a = input.nextBoolean();
		
		System.out.println("Insira outro valor boleano (true ou false): ");
		b = input.nextBoolean();
		
		valores.verdadeirosOuFalsos(a,b);
		
	}
}
