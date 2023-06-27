package aula8;

import java.util.Scanner;

public class Q6_1_1 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60 }; // declara o array

		System.out.printf("%s%7s\n", " Indice ", " Valor ");
		for (int contador = 0; contador < array.length; contador++) {
			System.out.printf("%d %10d\n", contador, array[contador]);
		}
	}

}
