package projekat;

public class Vozac {
	
	private String Ime;
	private String Prezime;
	private int ID;
	
	
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getPrezime() {
		return Prezime;
	}
	public void setPrezime(String prezime) {
		Prezime = prezime;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public Vozac() {
		
	}
	
	
	@Override
	public String toString() {
		return "Ime: " + this.Ime + " Prezime: " + this.Prezime + " ID: " +this.ID; 
	}
	
	
	public Vozac(String ime, String prezime, int id) {
		super();
		Ime = ime;
		Prezime = prezime;
		ID = id;
		}
	}
