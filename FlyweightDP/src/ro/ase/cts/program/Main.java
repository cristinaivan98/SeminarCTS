package ro.ase.cts.program;

import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(1,4,"10:00");
		Rezervare rezervare2=new Rezervare(2,5,"20:00");
		Rezervare rezervare3=new Rezervare(3,4,"18:00");
		
		FlyweightFactory flyweightFactory=new FlyweightFactory();
		flyweightFactory.getClient("073297442").printRezervare(rezervare1);
		flyweightFactory.getClient("0729484242").printRezervare(rezervare2);
		flyweightFactory.getClient("0732742423").printRezervare(rezervare3);
		
		
	}
}
