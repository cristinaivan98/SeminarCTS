package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class EleviReader extends IReader{
	public EleviReader(String filePath) {
		super(filePath);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.filePath));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev=new Elev();
			super.citireAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			//Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}
}
