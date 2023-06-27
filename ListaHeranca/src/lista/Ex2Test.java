package lista;

public class Ex2Test {

	public static void main(String args[]) {
		Gato gato = new Gato("Mingau");
		Cachorro cachorro = new Cachorro("Pingo");
		gato.setRaca("Persa");
		cachorro.setRaca("Pastor Alemão");
		System.out.println(gato.toString()+"\n");
		System.out.println(cachorro.toString());
	}
}
