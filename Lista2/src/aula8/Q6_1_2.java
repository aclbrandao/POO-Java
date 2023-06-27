package aula8;

public class Q6_1_2 {
	public static void main(String[] args) {
		final int Array_Tamanho = 10;
		int array []= new int [ Array_Tamanho ];

		for(int contador = 0; contador < array.length; contador++){
			array[contador] = 2 + 2 * contador;
		}
		System.out.printf("%s%7s\n"," Indice "," Valor ");
		
		for (int cont = 0; cont < array.length ; cont++){
			System.out.printf("%d %10d\n", cont, array[cont]);
		}
		
	}
}
