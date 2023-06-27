/*8. Implemente um programa que leia um valor inicial A e imprima a sequencia de valores do calculo
de A! e o seu resultado. Ex: 5! = 5 ∗ 4 ∗ 3 ∗ 2 ∗ 1 = 120.
*/
package aula8;

import java.util.*;

public class Q08 {
	public void fatorialA() {
		int a, cont, fatorial = 1;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um numero inteiro para saber seu fatorial: ");
		a = input.nextInt();

		System.out.print("\nCalculando " + a + " ! = ");
		cont = a;

		while (cont > 0) {

			if (cont > 1) {
				System.out.print(cont + " x ");
			} else {
				System.out.print(cont + " = ");
			}
			fatorial *= cont;
			cont--;

		}
		System.out.print(fatorial);

	}

}