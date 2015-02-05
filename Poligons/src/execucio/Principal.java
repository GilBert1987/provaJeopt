package execucio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("prova4");
		
		interficies.Quadrat q = new interficies.Quadrat();
		interficies.Triangle t = new interficies.Triangle();
		interficies.Circumferencia c = new interficies.Circumferencia();
		
		q.setLongitud(3);
		System.out.println(q.toString());;
		
		c.setRadi(11.3);
		System.out.println(c.toString());
		
		t.setAltura(2.3);
		t.setBase(1.2);
		System.out.println(t.toString());
		
		/******************************************************************/
		
		System.out.println(); System.out.println(); System.out.println();
		
		classes.Quadrat qq = new classes.Quadrat();
		classes.Triangle tt = new classes.Triangle();
		classes.Circumferencia cc = new classes.Circumferencia();
		
		qq.setLongitud(3);
		System.out.println(qq.toString());;
		
		cc.setRadi(11.3);
		System.out.println(cc.toString());
		
		tt.setAltura(2.3);
		tt.setBase(1.2);
		System.out.println(tt.toString());
		
		
		
		

	}

}
