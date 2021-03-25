package ro.ase.cts.clase;

public abstract class PersonalSpital {
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public PersonalSpital(String nume) {
		this.nume = nume;
	}
	
}