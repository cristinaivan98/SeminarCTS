package ro.ase.cts.clase;

public class ComandaOcupare extends Comanda {

	public ComandaOcupare(Masa masa) {
		super(masa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.masa.ocupaMasa();
	}

}
