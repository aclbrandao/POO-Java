package Heranca;

public class EmpregadoComissionado {
	
	private String primeiroNome, ultimoNome, CPF;
	private double vendasBrutas, porcentagemComissao;
	
	public EmpregadoComissionado (String primeiroNome, String ultimoNome, String CPF, 
								  double vendabruto, double taxa) {
		
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.CPF = CPF;
		setVendaBruta(vendabruto);
		setTaxaComissao(taxa);
		
	} //fim do construtor

	public void setPrimeiroNome (String first) {
		primeiroNome = first;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	public String setUltimoNome() {
		 return ultimoNome;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}
	
	public void setCPF (String cpf) {
		CPF = cpf;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setVendaBruta(double vendas) {
		vendasBrutas = (vendas<0.0)? 0.0 : vendas;
	}
	
	public double getVendaBruta() {
		return vendasBrutas;
	}
	
	public void setTaxaComissao (double taxa) {
		porcentagemComissao = (taxa > 0.0 && taxa < 1.0)? taxa: 0.1;
		// a taxa varia de 1% ate 100%
	}
	
	public double getTaxaComissao() {
		return porcentagemComissao;
	}
	
	public double Salario() {
		return vendasBrutas * porcentagemComissao;
	}
	
	

}
