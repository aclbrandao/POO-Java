package lista;

public class Ex3Teste {

	public static void main(String args[]) {
		Pobre pobre = new Pobre();
		Rica rica = new Rica(50000);
		Miseravel miseravel = new Miseravel();
		pobre.setNome("Raul");
		pobre.setIdade(23);
		rica.setNome("Marina");
		rica.setIdade(18);
		miseravel.setNome("João");
		miseravel.setIdade(45);
		pobre.trabalha();
		rica.fazCompras();
		miseravel.mendiga();
	}
}
