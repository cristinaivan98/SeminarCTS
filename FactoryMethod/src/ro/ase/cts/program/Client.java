package ro.ase.cts.program;

import ro.ase.cts.clase.FactoryAsistent;
import ro.ase.cts.clase.FactoryBrancardier;
import ro.ase.cts.clase.FactoryInfirmier;
import ro.ase.cts.clase.IFactory;
import ro.ase.cts.clase.PersonalSpital;

public class Client {
	public static void afisareInformatiiPersonalSpital(IFactory factory,String nume) {
		PersonalSpital personalSpital =factory.getPersoana(nume);
		System.out.println(personalSpital.toString());
	}
 public static void main(String []args) {
	 afisareInformatiiPersonalSpital(new FactoryAsistent(),"Mircea");
	 afisareInformatiiPersonalSpital(new FactoryBrancardier(),"Cristina");
	 afisareInformatiiPersonalSpital(new FactoryInfirmier(),"Georgiana");
 }
}
