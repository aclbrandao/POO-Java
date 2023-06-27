package InterfaceJava;

public class Funcionario {
	
	private String PrimeiroNome;
	private String UltimoNome;
	private String cpf;
	
	public Funcionario (String PrimeiroNome, String UltimoNome, String cpf) {
		
		this.PrimeiroNome = PrimeiroNome;
		this.UltimoNome = UltimoNome;
		this.cpf = cpf;
	}

	public void setPNome(String s) {
		PrimeiroNome = s;
	}

	public String getPNome() {
		return PrimeiroNome;
	}
	
	public void setUNome(String s) {
		UltimoNome = s;
	}

	public String getUNome() {
		return UltimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String c) {
		cpf = c;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s \ncpf: %s", getPNome(), getUNome(), getCpf());
	}
	
}
