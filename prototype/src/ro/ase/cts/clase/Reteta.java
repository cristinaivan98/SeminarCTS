package ro.ase.cts.clase;

public class Reteta implements PrototipAbstract {
	private String denumireSolutie;
	private int cantitateSolutie;
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		
		//validari
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}
private Reteta() {
		
		//fara validari
		this.denumireSolutie = "Solutie1";
		this.cantitateSolutie = 3;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutie=");
		builder.append(denumireSolutie);
		builder.append(", cantitateSolutie=");
		builder.append(cantitateSolutie);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public PrototipAbstract copiaza() {
		Reteta copie=new Reteta();
		copie.cantitateSolutie=this.cantitateSolutie;
		copie.denumireSolutie=this.denumireSolutie;
		return copie;
	}
	
}
