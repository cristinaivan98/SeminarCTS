package ro.ase.cts.program;



import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(IReader readAplicant) throws FileNotFoundException{
			return readAplicant.readAplicants();
		
		
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti( new AngajatiReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				{System.out.println(aplicant.toString());
			     System.out.println(aplicant.getSumaFinantata());
			    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
