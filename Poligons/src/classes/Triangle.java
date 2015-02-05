package classes;

public class Triangle extends Poligon {
	
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
	
	public double area() {
		// TODO Auto-generated method stub
		return (this.base*this.altura) / 2;
	}
	
	@Override
	public String toString(){
		return "La base és: "+this.base+"\n"+"L'alçada és: "+this.altura+"\n"+"L'àrea és: "+area();
	}


}
