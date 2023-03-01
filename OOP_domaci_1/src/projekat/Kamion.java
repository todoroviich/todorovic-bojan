package projekat;

public class Kamion extends Vozilo{
	
public Kamion() {
		
	}
	
	public Kamion(Vozac vozac,String tipvozila,String boja) {
		
		super(vozac,tipvozila,boja);
	}
	
	@Override
	public double Gorivo(double cenaPoLitru) {
		
		return super.Gorivo(cenaPoLitru)*2;
	}

}
