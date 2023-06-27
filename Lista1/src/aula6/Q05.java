package aula6;
/*5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
imprimindo o resultado.*/

import java.util.*;

public class Q05 {
	private int resultado;

	// metodos:

	public void tratamento(int n) {
		if (n >= 0) {
			resultado = n * 2;
			System.out.println("O dobro de " + n + " e " + resultado);
		} else {
			resultado = n * 3;
			System.out.println("O triplo de " + n + " e " + resultado);
		}
	}

	// main:
	public static void main(String[] args) {
		Q05 numero = new Q05();

		Scanner input = new Scanner(System.in);

		int n;

		System.out.println("Insira um numero: ");
		n = input.nextInt();

		numero.tratamento(n);

	}

}
