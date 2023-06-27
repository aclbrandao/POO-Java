package Polimorfismo;

public class EmpregadoComissionado extends Empregado {
	
	private double vendasBruta;
	private double porcentagemComissao;
	public EmpregadoComissionado(String primeiroNome, String ultimoNome, String cpf, double vendasBruta, double porcentagemComissao) {
		super(primeiroNome, ultimoNome, cpf);
		
		setVendasBruta(vendasBruta);
		setTaxaComissao(porcentagemComissao);
	}
	
	
	
	public double getVendasBruta() {
		return vendasBruta;
	}
	
	public void setVendasBruta(double vendas) {
		this.vendasBruta = (vendas < 0.0) ? 0.0 : vendas;
	}
	
	public double getTaxaComissao() {
		return porcentagemComissao;
	}
	
	public void setTaxaComissao(double taxa) {
		this.porcentagemComissao = (taxa > 0.0 && taxa < 1.0) ? taxa : 0.0;
	}
	
	public double vencimento() 
	{
		return getTaxaComissao() * getVendasBruta();
	}
	
	public String toString() 
	{
		return String.format("%s: %s\n%s: $%.2f; %s: %.2f", "Empregado Comissionado", super.toString(), "Vendas Brutas", getVendasBruta(), "Porcentagem Comissao", getTaxaComissao());
	}
	
	
	

}
