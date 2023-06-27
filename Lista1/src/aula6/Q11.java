/*EDITAR, VOCê FEZ MAIS DO QUE O SUFICIENTE, DESCANSA, SE CUIDA!*/

package aula6;

import java.util.*;

public class Q11 {


	Scanner input;
	double ID, nota1, nota2, nota3, mediaExercicios, mediaFinal;

	public Q11() {
		input = new Scanner(System.in);
	}
	
	public void setID() {
		System.out.println("Digite o numero de identificacao do aluno: ");
		this.ID = input.nextDouble();
	}

	public void setNota1() {
		System.out.println("Insira a nota da primeira avaliacao: ");
		this.nota1 = input.nextDouble();
	}
	
	public void setNota2() {
		System.out.println("Insira a nota da segunda avaliacao: ");
		this.nota2 = input.nextDouble();
	}

	public void setNota3() {
		System.out.println("Insira a nota da terceira avaliacao: ");
		this.nota3 = input.nextDouble();
	}
	
	public void setMediaExercicios () {
		System.out.println("Insira a media dos exercicios: ");
		this.mediaExercicios = input.nextDouble();
	}
	
	public double calculoMedia() {
		mediaFinal = (nota1+(nota2*2)+(nota3*3)+ mediaExercicios)/7;
		return mediaFinal;
	}
	
	public void imprimeDados() {
		System.out.println("Numero de identificacao: "+ID);
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("Nota 3: "+nota3);
		System.out.println("Media dos exercicios: "+mediaExercicios);
		System.out.printf("Media final: %.2f", mediaFinal);
		System.out.println("");
	}
	
	public void situacaoMedia () {
		if (mediaFinal < 40) {
			System.out.println("Conceito: E.\n"+"Situacao: Reprovado");
		} else if (mediaFinal <= 59) {
			System.out.println("Conceito: D.\n"+"Situacao: Reprovado");
		} else if (mediaFinal <= 74) {
			System.out.println("Conceito: C.\n"+"Situacao: Aprovado");
		} else if (mediaFinal <= 89) {
			System.out.println("Conceito: B.\n"+"Situacao: Aprovado");
		} else if (mediaFinal > 90) {
			System.out.println("Conceito: A.\n"+"Situacao: Aprovado");
		}
	}

	public static void main(String[] args) {
		Q11 media = new Q11();

		media.setID();
		media.setNota1();
		media.setNota2();
		media.setNota3();
		media.setMediaExercicios();
		media.calculoMedia();
		media.imprimeDados();
		media.situacaoMedia();
		
	}
}
