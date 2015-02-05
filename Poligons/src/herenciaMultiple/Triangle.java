package herenciaMultiple;

public class Triangle extends Posicio implements Poligon, Moviment {
	
	private double base;
	private double altura;
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void FerMoviment(Poligon p) {
		// TODO Auto-generated method stub

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
