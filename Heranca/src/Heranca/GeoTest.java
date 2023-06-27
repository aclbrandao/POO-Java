package Heranca;

public class GeoTest {
	
	public static void main (String arg[]) {
	
	Circulo obj1 = new Circulo(2, 1, (float) 3.2);
	Cilindro obj2 = new Cilindro(4, (float)1.3, 1, 2);
	
		System.out.println("¡rea do CÌrculo = "+ obj1.area());
		obj1.Status();
		System.out.println("\n¡rea do Cilindro = "+ obj2.area());
		obj2.Status();
	}
}
