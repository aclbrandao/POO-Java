package InterfaceJava;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		
		Funcionario obj1 = new Funcionario("Jhean", "Alexis", "010.010.010-10");
		Gerente obj2 = new Gerente("0001", "Ana", "Clara", "020.020.020.20");
		Diretor obj3 = new Diretor("00P001", "Wilmondes", "Gabriel", "030.030.030-30");

		System.out.println(obj1.toString());
		System.out.println("\n" + obj2.toString());
		System.out.println("\n" + obj2.toString1());
		System.out.println("\n" + obj3.toString());
		System.out.println("\n" + obj3.toString1());

	}

	
}
