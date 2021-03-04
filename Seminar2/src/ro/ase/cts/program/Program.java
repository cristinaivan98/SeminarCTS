package ro.ase.cts.program;



import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.AngajatiReader;


import ro.ase.cts.clase.Angajat;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = AngajatiReader.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
