package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String,Flyweight> clienti;

	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<>();
	}
	public Flyweight getClient(String nrTelefon) {
		Flyweight flyweight=clienti.get(nrTelefon);
		if(flyweight==null) {
			flyweight=new Client("Cristina",nrTelefon,"cristina@email.ro");
			clienti.put(nrTelefon, flyweight);
		}
		return flyweight;
	}

}
