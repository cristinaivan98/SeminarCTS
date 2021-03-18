package ro.ase.cts.clase;

public class Medic {
	private String nume;
	private int varsta;
	private String spital;
	private static Medic instance=null;
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public void setSpital(String spital) {
		this.spital = spital;
	}
	private Medic(String nume, int varsta, String spital) {
		this.nume = nume;
		this.varsta = varsta;
		this.spital = spital;
	}
	private Medic() {
		this.nume = "Stroe Adina";
		this.varsta = 50;
		this.spital = "Victor Babes";
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", spital=");
		builder.append(spital);
		builder.append("]");
		return builder.toString();
	}
	public static synchronized Medic getInstance(String nume,int varsta,String spital) {
		if(instance ==null) {
			instance=new Medic(nume,varsta,spital);
		}
		return instance;
	}
	
	
}
