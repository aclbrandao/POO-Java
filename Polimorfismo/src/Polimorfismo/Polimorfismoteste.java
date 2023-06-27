package Polimorfismo;

public class Polimorfismoteste {

	public static void main(String[] args) {
		
		EmpregadoAssalariado obj1 = new EmpregadoAssalariado( "Joao", "Felipe", "030.990.987-087", 800.00);
		EmpregadoHorista obj2 = new EmpregadoHorista("Karina", "Vergas", "021.453.133-432", 40.00, 16.75);
		EmpregadoComissionado obj3 = new EmpregadoComissionado("Hugo", "T", "045.990.081-54", 10000, 0.06);
		EmpregadoComissionadoPlus obj4 = new EmpregadoComissionadoPlus("Carlos", "Cezar", "345.231.543-090", 5000, 0.04, 300);
		
		
		System.out.println("******************Empregado processados individualmente**************************");
		System.out.printf("%s\n%s: $%.2f\n\n", obj1, "vencimento", obj1.vencimento());
		System.out.printf("%s\n%s: $%.2f\n\n", obj2, "vencimento", obj2.vencimento());
		System.out.printf("%s\n%s: $%.2f\n\n", obj3, "vencimento", obj3.vencimento());
		System.out.printf("%s\n%s: $%.2f\n\n", obj4, "vencimento", obj4.vencimento());
		
		Empregado[] empregados = new Empregado[4];
		
		empregados[0]= obj1;
		empregados[1]= obj2;
		empregados[2]= obj3;
		empregados[3]= obj4;
		
		System.out.println("***********************Empregados processados polimorficamente****************");
		
		
		//processando os dados
		for (Empregado correnteEmpregado : empregados) 
		{
			//verifica se o elemento e um empregadoComissionadoPlus
			if(correnteEmpregado instanceof EmpregadoComissionadoPlus) 
			{
				//downcast da referencia de empregado para objeto do tipo EmpregadoComissionadoPlus
				EmpregadoComissionadoPlus empregado = (EmpregadoComissionadoPlus) correnteEmpregado;
				empregado.setSalarioBase(1.10 * empregado.getSalarioBase());
				System.out.printf("Novo salario com 10%% de aumento e: $%.2f\n", empregado.getSalarioBase());
			}//fim  if

			
			System.out.printf("vencimentos $%.2f\n\n", correnteEmpregado.vencimento());
			
			
		} //end for
		
		//obtem o nome do ipo de cada objeto no array
		for(int i = 0; i < empregados.length; i++) 
		{
			System.out.printf("Empregado %d e um %s\n",i, empregados[i].getClass().getName());
		}
		
		
		

		
	}
}
