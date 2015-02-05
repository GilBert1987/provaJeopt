package classes;

public class Quadrat extends Poligon {
	
private int longitud;
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int llarg) {
		this.longitud = llarg;
	}

	public double area() {
		// TODO Auto-generated method stub
		return this.longitud * this.longitud;
	}
	
	@Override
	public String toString(){
		return "El costat és: "+this.longitud+"\n"+"L'àrea és: "+area();
	}
	
	

}
