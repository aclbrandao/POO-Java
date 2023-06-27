package arrays;
public class Q01 {

	// vetor denominado A que armazene 6 números inteiros:
	int a[] = new int[6];

	// um método que atribua os seguintes valores a esse vetor: 1, 0, 5,-2, -5, 7:
	public void atribuiValores() {
		a = new int[] { 1, 0, 5, -2, -5, 7 };
	}

	/*
	 * um método que armazene em uma variável inteira (simples) a soma entre os
	 * valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma:
	 */
	public void soma() {
		int soma;

		System.out.println("Soma dos valores:");
		System.out.printf("%d + %d + %d = ", a[0], a[1], a[5]);

		soma = a[0] + a[1] + a[5];
		System.out.println(soma);
		System.out.println("-----------------------------------");
	}

	/*
	 * método que modifique o vetor na posição 4, atribuindo a esta posição o valor
	 * 100 e imprima o array
	 */
	public void atualizaQuatro() {

		a[4] = 100;
		System.out.println("Vetor atualizado:");

		for (int atualizado : a) {

			System.out.print(atualizado + "  ");

		}
	}
}