package ro.ase.cts.clase;

public class BiletAdapter implements IBiletOnline {

	//nu adaugam functionalitati
	private Bilet bilet;
	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.vanzare();
		
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.rezervare();
	}

	public BiletAdapter(Bilet bilet) {
		super();
		this.bilet = bilet;
	}
	

}
