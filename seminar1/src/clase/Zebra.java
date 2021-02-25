package clase;

public class Zebra extends Animal{
	private int varsta;
	public Zebra(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.varsta=5;
	}



	public int getVarsta() {
		return varsta;
	}



	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}



	public Zebra(String name, int varsta) {
	super(name);
	this.varsta = varsta;
}
 
 
}
