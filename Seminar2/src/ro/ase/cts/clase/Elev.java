package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare=30;
	
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	public  float getSumaFinantata() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}
	@Override
	public String toString() {

		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Elev:").append(super.toString()).append(", clasa: ").append(clasa).append(" ,tutore: ").append(tutore);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	

	
}
