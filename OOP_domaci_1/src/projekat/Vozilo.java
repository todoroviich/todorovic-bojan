package projekat;

public class Vozilo {
	
	private String TipVozila;
	private String Boja;
	private Vozac Vozac;
	
	
	public Vozac getVozac() {
		return Vozac;
	}
	public void setVozac(Vozac vozac) {
		Vozac = vozac;
	}
	public String getTipVozila() {
		return TipVozila;
	}
	public void setTipVozila(String tipVozila) {
		TipVozila = tipVozila;
	}
	public String getBoja() {
		return Boja;
	}
	public void setBoja(String boja) {
		Boja = boja;
	}
	
	
	
	public double Gorivo(double cenaPoLitru) {
		return 8 * cenaPoLitru;
	}
	
	
	@Override
	public String toString() {
		
		return "Tip vozila: " +this.TipVozila + " Boja: " +this.Boja + " " + this.Vozac.toString();
	}
	
	public Vozilo() {
		
	}
	
	public Vozilo(projekat.Vozac vozac, String tipvozila, String boja) {
		
		Vozac = vozac;
		TipVozila = tipvozila;
		Boja = boja;
	}

}
