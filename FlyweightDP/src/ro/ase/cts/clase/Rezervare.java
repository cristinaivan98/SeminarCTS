package ro.ase.cts.clase;

public class Rezervare {
	private int numarMasa;
	private int nrPersoane;
	private String oraRezervare;
	public Rezervare(int numarMasa, int nrPersoane, String oraRezervare) {
		super();
		this.numarMasa = numarMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [numarMasa=" + numarMasa + ", nrPersoane=" + nrPersoane + ", oraRezervare=" + oraRezervare
				+ "]";
	}
	

}
