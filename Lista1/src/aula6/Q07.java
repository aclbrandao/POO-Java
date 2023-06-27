/*7) Faça um programa que leia uma variável e some 5 caso seja par ou some 8 caso seja
ímpar, imprimir o resultado desta operação.*/

package aula6;

import java.util.*;

public class Q07 {
	
	private int resultado;
	
	public void soma(int v) {
		if ((v%2) == 0) {
			resultado= v+5;
		} else {
			resultado= v+8;
		}
	}
	
	public int getResultado() {
		return this.resultado;
	}
	
	public static void main(String[] args) {
		Q07 variavel = new Q07();
				
		Scanner input = new Scanner(System.in);
				
		int v1;
				
		System.out.println("Insira um numero: ");
		v1=input.nextInt();
		
		variavel.soma(v1);
		System.out.println(variavel.getResultado());;
		
	}

}
