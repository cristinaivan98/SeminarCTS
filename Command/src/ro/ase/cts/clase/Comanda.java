package ro.ase.cts.clase;

public abstract class Comanda {
protected Masa masa;
public abstract void executa();
public Comanda(Masa masa) {
	super();
	this.masa = masa;
}


}
