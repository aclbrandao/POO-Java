package lista;

public class Pobre extends Pessoa{

	public void trabalha() {
		   System.out.println(super.getNome()+ " tem "+super.getIdade() +" de idade, é pobre  e trabalha 40 horas semanais por 1 salário mínimo!!");
	}
}
