package ro.ase.cts.clase;

public class LeafFiliala implements ISediu {

	private String numeFiliala;
	
	public LeafFiliala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Este filaiala "+numeFiliala);
		
	}

	@Override
	public void addNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementata");
		
		
	}

	@Override
	public void removeNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public ISediu getNod(int pozitie) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

}
