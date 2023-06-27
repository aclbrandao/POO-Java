/*2) Faça um programa que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja
“F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).*/

package aula6;

import java.util.Scanner;

public class Q02 {
	Scanner input2;
	private int tempo;
	
	public Q02() {
		input2= new Scanner (System.in);
	}
	
	public int tratamento(String sexo, int estadoCivil) {
		if (sexo.equalsIgnoreCase("F") && estadoCivil == 1) {
			System.out.println("Insira tempo de casada em anos: ");
			tempo = input2.nextInt();	
		}
	
		return tempo;
	}
	
	public static void main(String[] args) {
		
		Q02 dados = new Q02();
		
		Scanner input = new Scanner (System.in);
		
		String nome;
		String sexo;
		int estadoCivil;
		
		System.out.println("Insira os dados solicitados a seguir: \n"+"Nome: ");
		nome = input.nextLine();
		
		System.out.println("Sexo -> (F) FEMININO (M) MASCULINO");
		sexo = input.nextLine();
		
		System.out.println("Estado civil -> 1 CASADA 2 SOLTEIRA");
		estadoCivil = input.nextInt();
		
		dados.tratamento(sexo, estadoCivil);
	}

}
