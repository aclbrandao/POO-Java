package InterfaceJava;

public class Gerente extends Funcionario implements Autenticavel {
	
	private String senha;
	
	public Gerente(String s, String PrimeiroNome, String UltimoNome, String cpf) {
		
		super(PrimeiroNome, UltimoNome, cpf);
		senha = s;
	}
	
	public void setSenha(String s) {
		senha = s;
	}
	
	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return String.format("Gerente: \n%s", super.toString());
	}
	
	public boolean autentica(String senha) {
		if(!this.senha.equals(senha)) {
			return false;
		}
		
		return true;
	}
	
	public String toString1() {
		return String.format(super.toString()+ "\nAutenticou? %b\n",  this.autentica(this.getSenha()));
		
	}

}
