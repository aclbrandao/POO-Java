package Polimorfismo;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado{
	
	private double salarioBase;

	public EmpregadoComissionadoPlus(String primeiroNome, String ultimoNome, String cpf, double vendasBruta,
			double porcentagemComissao, double salarioBase) 
	{
		super(primeiroNome, ultimoNome, cpf, vendasBruta, porcentagemComissao);
		setSalarioBase(salarioBase);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salario) {
		this.salarioBase = (salario < 0.0) ? 0.0 : salario;
	}
	
	public double vencimento() 
	{
		return getSalarioBase() + super.vencimento();
	}
	
	public String toString() 
	{
		return String.format("%s $%s; %s: $%.2f", "Base assalariada", super.toString(), "salario base", getSalarioBase());
	}
	
}
