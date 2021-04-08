package ro.ase.cts.program;

import ro.ase.cts.clase.Persoana;
import ro.ase.cts.clase.VerificatorPersoane;

public class Main {
	public static void main(String[]args) {
		Persoana pers=new Persoana("Cristina","2981224588812");
		if(VerificatorPersoane.esteEligibila(pers)) {
			System.out.println("Putem sa oferim credit");
		}else {
			System.out.println("Nu putem sa oferim credit");
		}
	}
}
