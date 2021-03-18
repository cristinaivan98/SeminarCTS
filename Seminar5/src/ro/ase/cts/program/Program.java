package ro.ase.cts.program;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {
	public static void main(String[]args) {
	Presedinte presedinte1=Presedinte.getInstance();
	Presedinte presedinte2=Presedinte.getInstance();
	System.out.println(presedinte1.toString());
	System.out.println(presedinte2.toString());
	
	presedinte1.setNume("Basescu");
	presedinte2.setMandat(2);
	System.out.println(presedinte1.toString());
	System.out.println(presedinte2.toString());
	
	PresedinteLazy presedinteLazy1=PresedinteLazy.getInstance("PresedinteLazy", 40, 4);
	PresedinteLazy presedinteLazy2=PresedinteLazy.getInstance("PresedinteLazy22", 50, 1);
	System.out.println(presedinteLazy1.toString());
	System.out.println(presedinteLazy2.toString());
	
	Medic medic1=Medic.getInstance("Popescu Maria", 43, "Universitar");
	Medic medic2=Medic.getInstance("Rotaru Ramona", 30, "Fundeni");
	System.out.println(medic1.toString());
	System.out.println(medic2.toString());
	
	
	
	}
}