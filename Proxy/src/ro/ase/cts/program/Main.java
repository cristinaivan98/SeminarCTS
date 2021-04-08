package ro.ase.cts.program;

import ro.ase.cts.clase.Moneda;
import ro.ase.cts.clase.OperatorCredite;
import ro.ase.cts.clase.OperatorCrediteProxy;

public class Main {
	public static void main(String[]args) {
		OperatorCredite operator=new OperatorCredite();
		operator.creareCredit(Moneda.EUR, 4000);
		
		OperatorCrediteProxy proxy=new OperatorCrediteProxy(operator);
		proxy.creareCredit(Moneda.USD, 4000);
		proxy.creareCredit(Moneda.RON, 10000);
	
	}
}
