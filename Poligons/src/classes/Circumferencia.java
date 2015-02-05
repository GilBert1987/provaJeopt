package classes;

public class Circumferencia extends Poligon {
	
private double radi;

public Circumferencia(){
	super();
	radi = 0.0;
}
	

	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}

	@Override
	public String toString(){
		return "El radi és: "+this.radi+"\n"+"L'àrea és: "+area();
	}

	public double area() {
		// TODO Auto-generated method stub
		return pi*this.radi*this.radi;
	}

}
