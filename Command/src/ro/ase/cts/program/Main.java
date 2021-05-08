package ro.ase.cts.program;

import ro.ase.cts.clase.Comanda;
import ro.ase.cts.clase.ComandaOcupare;
import ro.ase.cts.clase.ComandaRezervare;
import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.Operator;

public class Main {
public static void main(String[] args) {
	Masa masa1=new Masa(1);
	Masa masa2=new Masa(2);
	Comanda rezervare1=new ComandaRezervare(masa1);
	Comanda ocupare1=new ComandaOcupare(masa2);
	Comanda rezervare2=new ComandaRezervare(masa2);
	Operator operator=new Operator();
	operator.invoca(ocupare1);
	operator.invoca(rezervare1);
	operator.executaComanda();
	operator.invoca(rezervare1);
	operator.executaComanda();
	operator.executaComanda();
	
	
}
}
