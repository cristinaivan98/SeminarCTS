package ro.ase.cts.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {

	public DecoratorCuLaMultiAni(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}

	@Override
	public void printeazaNota() {
		// TODO Auto-generated method stub
		super.printeazaNota();
		System.out.println(" La multi ani!");
	}
	

}
