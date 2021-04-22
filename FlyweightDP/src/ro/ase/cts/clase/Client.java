package ro.ase.cts.clase;

public class Client implements Flyweight {
	private String nume;
	private String nrTelefon;
	private String email;
	@Override
	public void printRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println(toString()+rezervare.toString());
		
	}
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
	}
	
}
