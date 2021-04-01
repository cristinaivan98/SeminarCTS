package ro.ase.cts.program;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAdapter;
import ro.ase.cts.clase.BiletAdapterClase;
import ro.ase.cts.clase.IBiletOnline;

public class Main {
	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	public static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.rezervaBiletOnline();
	}
	public static void main(String[] args) {
		Bilet bilet=new Bilet(30);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		IBiletOnline adapter=new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(adapter);
		
		IBiletOnline adapterClase=new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(adapterClase);
	
	}
}
