package Polimorfismo;

public abstract class Empregado {
	
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	
	public Empregado (String primeiroNome, String ultimoNome, String cpf) 
	{
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
	}

	
	//getters setters
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() 
	{
		return String.format("%s %s\ncpf: %s", getPrimeiroNome(), getUltimoNome(), getCpf());
	}
	
	public abstract double vencimento();
	
	
	
	
	

}
