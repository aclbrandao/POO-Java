package lista;

public class Ex1Teste {

	public static void main(String args[]) {
		
		AssistenteAdministrativo  obj= new AssistenteAdministrativo("Maria", 1453.34, 124567, "noite", 300);
		AssistenteTecnico obj2= new AssistenteTecnico(400, "Dulce", 1657, 23464);
		
		System.out.println(obj.toString()+"\n");
		System.out.println(obj2.toString()+"\n");
		
	}
	
}
