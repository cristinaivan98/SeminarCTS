package ro.ase.cts.clase;

public class Client {
	private String nume;
	private IPlata modPlata;
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new Card();
		
	}
	public void platesteNota(float suma) {
		System.out.println("Clientul "+nume+" are de plata: "+suma);
		modPlata.plateste(suma);
	}
	public void setModPlata(IPlata modPlata) {
		this.modPlata = modPlata;
	}
	

}
