package interficies;

public class Circumferencia implements Poligon {
	
	private double radi;
	

	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}

	@Override
	public String toString(){
		return "El radi �s: "+this.radi+"\n"+"L'�rea �s: "+area();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*this.radi*this.radi;
	}

}
