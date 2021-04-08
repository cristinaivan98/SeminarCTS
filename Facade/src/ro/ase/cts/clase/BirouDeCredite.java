package ro.ase.cts.clase;

public class BirouDeCredite {
	public static boolean areCredite(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0) {
			return true;
			
		}else return false;
	}
}
