package ro.ase.cts.clase;

public class DecoratorUrarePaste extends DecoratorAbstract {

	public DecoratorUrarePaste(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("FELICITARE: Paste fericit");
		
	}

	@Override
	public void printeazaNota() {
		// TODO Auto-generated method stub
		super.printeazaNota();
		System.out.println("Paste fericit!");
	}
	

}
