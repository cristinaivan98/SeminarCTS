package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Main {
	public static void main(String [] args) {
	/////PRIMA VARIANTA DE BUILDER//////////////
	 Rezervare rezervare1;
	 Rezervare rezervare2;
	 RezervareBuilder rezervareBuilder=new RezervareBuilder();
	 rezervareBuilder.setCodRezervare(100).setAreMancare(true);
	 rezervare1=rezervareBuilder.build();
	 rezervare2=new RezervareBuilder().setCodRezervare(101).setAreMancare(true).build();
	Rezervare rezervare4;
	 rezervareBuilder.setCodRezervare(104).setAreMuzica(true).setAreScaun(true);
	 rezervare4=rezervareBuilder.build();
	 Rezervare rezervare3=new Rezervare(102,true,false,true,true,"pop");
	 System.out.println(rezervare1);
	 System.out.println(rezervare2);
	 System.out.println(rezervare3);
	 System.out.println(rezervare4);
	 
	 ////////A DOUA VARIANTA DE BUILDER////////////////////////
	 RezervareBuilderV2 rbv2=new RezervareBuilderV2().setAreMancare(true)
.setAreBautura(true).setAreScaunErgonomic(true);
	 Rezervare rezervare5=rbv2.setCodRezervare(140).build();
	 Rezervare rezervare6=rbv2.setCodRezervare(150).build();
	 }

	

}
