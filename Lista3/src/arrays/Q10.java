/*Faça um programa que leia um vetor de 10 posições e verifique se existem
valores iguais e os escreva na tela.
*/

package arrays;

import java.util.*;

public class Q10 {

	private double array[] = new double[4];
	Scanner entrada = new Scanner(System.in);
	boolean repetiu;
	double last = array[0] + 1;

	public void carregaArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um numero: ");
			array[i] = entrada.nextDouble();

			//for(int j = i+1; j <array.length;j++){
				if (array[i] == array[i - 1]  &&
					     last != array[i-1]) {
				repetiu = true;
				last = array[i];
				System.out.println("O Numero: " + last + " Se Repete no Vetor");
			//}
			}
			
		}

	}

}
