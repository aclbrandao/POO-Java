/*10) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o
preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da
tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado*/

package aula6;

import java.util.*;

public class Q10 {

	Scanner input, input2;
	private double preco;
	private String condicao;

	public Q10() {
		input = new Scanner(System.in);
		input2 = new Scanner(System.in);
	}

	public void setPreco() {
		System.out.print("Preco do produto: R$");
		preco = input.nextDouble();
	}

	public void setCondicao() {
		System.out.println(
				"Selecione a forma de pagamento: \n" + "(1) Dinheiro ou cheque \n" + "(2) Cartao de credito à vista\n"
						+ "(3) Cartao de credito parcelado em duas vezes\n" + "(4)Cartao de credito parcelado em tres vezes");
		condicao = input2.nextLine();
	}
	
	public void calculaPrecoFinal() {
		if (condicao.equals("1") || condicao.equalsIgnoreCase("dinheiro")) {
			preco = preco*0.9;
			System.out.println("Preco final: R$"+preco);
		} else if (condicao.equals("2") || condicao.equalsIgnoreCase("credito")) {
			preco = preco*0.85;
			System.out.println("Preco final: R$"+preco);
		} else if (condicao.equals("3") || condicao.equalsIgnoreCase("duas vezes")) {
			System.out.println("Preco final: R$"+preco);
			
		} else if (condicao.equals("4") || condicao.equalsIgnoreCase("tres vezes")) {
			preco = preco*1.1;
			System.out.println("Preco final: R$"+preco);
		} else {
			System.out.println("Erro, forma de pagamento invalida.");
		}
	}

	public static void main(String[] args) {
		Q10 pagamento = new Q10();

		pagamento.setPreco();
		pagamento.setCondicao();
		pagamento.calculaPrecoFinal();

	}

}
