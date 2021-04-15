package ro.ase.cts.clase;

public abstract class DecoratorAbstract implements INota {

	private INota nota;

	public DecoratorAbstract(INota nota) {
		super();
		this.nota = nota;
	}
	public abstract void printeazaFelicitare(); 
		
	
		
	@Override
	public void printeazaNota() {
		// TODO Auto-generated method stub
		nota.printeazaNota();
		
	}
	
}
