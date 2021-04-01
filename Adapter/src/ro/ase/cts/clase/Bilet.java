package ro.ase.cts.clase;

public class Bilet {
	private float pret;

	public Bilet(float pret) {
		this.pret = pret;
	}
	public void vanzare() {
		System.out.println("S-a vandut biletul:  "+this.pret);
		
	}
	public void rezervare() {
		System.out.println("S-a rezervat biletul"+this.pret);
	}
	
}
