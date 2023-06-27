package Heranca;

public class Cilindro extends Circulo {
	protected float altura;
	
	public Cilindro(float altura, float raio, float x, float y) {
		super(raio, x, y);
		setAltura(altura);
	}
	
	public void setAltura(float altura) {
		if (altura <= 0) {
			this.altura = 0;
		} else {
			this.altura = altura;
		}
	}
	
	public float getAltura() {
		return altura;
	}
	
	//@Override
	public float area() {
		return (float) (2 * super.area() + Math.PI * raio * altura);
	}
	
	//@Override
	public void Status() {
		System.out.println("Centro: "+x+", "+y + " Raio: "+ raio +" Altura: "+ altura);
	}

}
