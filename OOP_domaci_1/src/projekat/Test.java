package projekat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vozac vozac = new Vozac("Bojan", "Todorovic", 111);
		System.out.println(vozac.toString());
		Vozilo motor = new Vozilo(vozac,"Motor","Crna");
		System.out.println(motor.toString());

	}

}
