/*1) Faça um programa que leia os valores A, B, C e imprima na tela se a soma de A + B é
menor que C.
*/

package aula6;

//1- importar biblioteca:
import java.util.Scanner;

public class Q01 {
	
	private int resultado;
	
	public int soma(int A, int B) {
		resultado = A + B;
		return resultado;
	}
	
	public void tratamentoC (int C) {
		if (this.resultado < C) {
			System.out.println("A soma dos dois primeiros numeros e menor que o terceiro numero!");
		}
	}
	
	public static void main(String[] args) {
		
		Q01 calculo = new Q01();
				
		Scanner input = new Scanner (System.in);
		
		int A;
		int B;
		int C;
		
		System.out.println("Insira um numero inteiro: ");
		A = input.nextInt();
				
		System.out.println("Insira o segundo numero inteiro: ");
		B = input.nextInt();
		
		calculo.soma(A, B);
		
		System.out.println("Insira o último numero inteiro: ");
		C = input.nextInt();
		
		calculo.tratamentoC(C);		
	}
}
