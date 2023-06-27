package Polimorfismo;

public class EmpregadoAssalariado extends Empregado {
	
	private double salarioSemanal;

	public EmpregadoAssalariado(String primeiroNome, String ultimoNome, String cpf, double salarioSemanal) {
		super(primeiroNome, ultimoNome, cpf);
		
		setSalarioSemanal(salarioSemanal);
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salario) {
		this.salarioSemanal = salario <0.0 ? 0.0 : salario;
	}
	
	public double vencimento() 
	{
		return getSalarioSemanal();
	}
	
	public String toString() 
	{
		return String.format("Empregado assalariado: %s \n%s: $%.2f", super.toString(), "Salario semanal ", getSalarioSemanal());
	}

}
