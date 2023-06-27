package InterfaceJava;

public class Diretor extends Funcionario implements Autenticavel {
	
	private String SenhaDiretor;
	
	public Diretor (String SenhaDiretor, String PrimeiroNome, String UltimoNome, String cpf) {
		super(PrimeiroNome, UltimoNome, cpf);
		this.SenhaDiretor = SenhaDiretor;
	}
	
	public void setSenha(String s) {
		SenhaDiretor = s;
	}
	
	public String getSenhaDiretor() {
		return SenhaDiretor;
	}
	
	@Override
	public String toString() {
		return String.format("Diretor: \n%s", super.toString());
	}
	
	@Override
	public boolean autentica(String senha) {
		if(senha.length() > 6 && senha.charAt(2) == super.getPNome().charAt(0) 
				&& senha == this.SenhaDiretor) {
			
			return true;
		} 
		else return false;
	}
	
	public String toString1() {
		return String.format(super.toString()+ "\nAutenticou? %b\n",  this.autentica(this.getSenhaDiretor()));
		
	}

}
