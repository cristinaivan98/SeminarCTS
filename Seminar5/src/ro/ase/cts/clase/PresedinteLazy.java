package ro.ase.cts.clase;

public class PresedinteLazy {
	private String nume;
	private int varsta;
	private int mandat;
	
	private static PresedinteLazy instance=null;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getMandat() {
		return mandat;
	}

	public void setMandat(int mandat) {
		this.mandat = mandat;
	}



	private PresedinteLazy(String nume, int varsta, int mandat) {
	
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}

	private PresedinteLazy() {
		this.nume="Presedinte";
		this.varsta=40;
		this.mandat=2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PresedinteLazy [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", mandat=");
		builder.append(mandat);
		builder.append("]");
		return builder.toString();
	}
	public static synchronized PresedinteLazy getInstance(String nume,int varsta,int mandat) {
		if(instance ==null) {
			instance=new PresedinteLazy(nume,varsta,mandat);
		}
		return instance;
	}
	
}
