package ro.ase.cts.program;

import ro.ase.cts.clase.Masa;

public class Main {
 public static void main(String[] args) {
	 Masa masa=new Masa(7);
	 masa.eliberareMasa();
	 masa.rezervaMasa();
	 masa.ocupaMasa();
	 masa.ocupaMasa();
	 masa.eliberareMasa();
 }
}
