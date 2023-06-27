package Heranca;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado {
	
	private double salarioBase;
	public EmpregadoComissionadoPlus(double salario, String primeiroNome, String ultimoNome,
			String CPF, double vendabruto, double taxa) {
		super (primeiroNome, ultimoNome, CPF, vendabruto, taxa);
		
		setSalarioBase(salario);
	}
	
	//public double getSalarioBase() {
	//	return salarioBase;
	//}
	
	public void setSalarioBase(double salario) {
		salarioBase = (salario < 0.0)? 0.0 : salario;	
	}
	
	public double getSalarioBase() {
		return salarioBase + (super.getTaxaComissao() * super.getVendaBruta());
	}
	
}
