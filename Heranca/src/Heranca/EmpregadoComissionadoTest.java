package Heranca;

public class EmpregadoComissionadoTest {
	
	public static void main(String args[]) {
		
		EmpregadoComissionado obj = new EmpregadoComissionado("Manoel", "Chaves", "030.991.091-66",
				23890.4, 0.05);
		System.out.printf("Empregado: %s %s \n", obj.getPrimeiroNome(), obj.getUltimoNome());
		System.out.println("CPF: "+ obj.getCPF());
		System.out.println("Total de Vendas: "+ obj.getVendaBruta());
		System.out.println("Taxa de Comissão: "+ obj.getTaxaComissao());
		System.out.printf("Salário: %.2f \n", obj.Salario());
	}

}
