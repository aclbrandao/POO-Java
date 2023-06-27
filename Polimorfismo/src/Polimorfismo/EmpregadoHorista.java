package Polimorfismo;

public class EmpregadoHorista extends Empregado {

	private double valorHora;
	private double horas;
	public EmpregadoHorista(String primeiroNome, String ultimoNome, String cpf, double valorHora, double horas) {
		super(primeiroNome, ultimoNome, cpf);
		
		setValorHora(valorHora);
		setHoras(horas);	
	}
	
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valor) {
		this.valorHora = (valor < 0.0) ? 0.0 : valor;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = ((horas > 0.0) && (horas <= 168)) ? horas : 0.0;
	}
	
	public double vencimento() 
	{
		if (getHoras() <= 40) 
		{
			return getValorHora() * getHoras();
		}
		else 
		{
			return 40 * getValorHora() + (getHoras() - 40) * getValorHora() * 1.5;
		}
	}
	
	public String toString() 
	{
		return String.format("Empregado Horista: %s\n%s: $%.2f, %s: %.2f", super.toString(), "valor hora", getValorHora(), "horas trabalhadas", getHoras());
		
	}
	
	
	
	
}
