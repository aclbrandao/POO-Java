/*8) Escreva um programa que leia três valores inteiros e diferentes e mostre-os em ordem
decrescente.
*/

package aula6;

import java.util.*;

public class Q08 {

	Scanner input1, input2, input3;
	int n1, n2, n3;

	public Q08() {
		input1 = new Scanner(System.in);
		input2 = new Scanner(System.in);
		input3 = new Scanner(System.in);
	}

	public void setN1() {
		System.out.println("Digite um numero inteiro: ");
		this.n1 = input1.nextInt();
	}

	public void setN2() {
		System.out.println("Digite um outro numero inteiro: ");
		this.n2 = input2.nextInt();
	}

	public void setN3() {
		if (n2 != n1) {
			System.out.println("Digite um numero diferente dos dois anteriores: ");
			n3 = input3.nextInt();
		} else {

			System.out.println("Erro, foram inseridos 2 numeros iguais!");
		}
	}

	public void trataN3() {
		if ((n3 == n2) || (n3 == n1)) {
			System.out.println("Erro, foram inseridos 2 numeros iguais!");
		}
	}

	public void descrescente() {
		if (n1 != n2 && n2 != n3 && n3 != n1) {
			if ((n1 > n2) && (n1 > n3)) {
				if (n2 > n3) {
					System.out.println(n1 + "," + n2 + "," + n3);
				} else if (n3 > n2) {
					System.out.println(n1 + "," + n3 + "," + n2);
				}
			} else if ((n2 > n1) && (n2 > n3)) {
				if (n1 > n3) {
					System.out.println(n2 + "," + n1 + "," + n3);
				} else if (n3 > n1) {
					System.out.println(n2 + "," + n3 + "," + n1);
				}
			} else {
				if (n1 > n2) {
					System.out.println(n3 + "," + n1 + "," + n2);
				} else {
					System.out.println(n3 + "," + n2 + "," + n1);
				}
			}
		}

	}

	public static void main(String[] args) {
		Q08 ordena = new Q08();
		ordena.setN1();
		ordena.setN2();
		ordena.setN3();
		ordena.trataN3();
		ordena.descrescente();

	}

}
