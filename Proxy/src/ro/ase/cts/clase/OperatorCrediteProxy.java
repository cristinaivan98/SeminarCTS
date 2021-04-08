package ro.ase.cts.clase;

public class OperatorCrediteProxy implements IOperatorCredite {
	private OperatorCredite operator;
	
	public OperatorCrediteProxy(OperatorCredite operator) {
		super();
		this.operator = operator;
	}

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		if(moneda ==Moneda.RON) {
			operator.creareCredit(moneda, suma);
			
		}
		System.out.println("Banca ofera credite in RON");
		
	}

}
