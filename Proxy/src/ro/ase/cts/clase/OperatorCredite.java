package ro.ase.cts.clase;

public class OperatorCredite implements IOperatorCredite {

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		// TODO Auto-generated method stub
		System.out.println("A fost creat creditul cu suma de "+suma+" "+moneda);
		
	}
	
}
