package ro.ase.cts.program;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.Cash;
import ro.ase.cts.clase.Client;

public class Main {
	public static void main(String[] args) {
		Client client=new Client("Cristina");
		client.setModPlata(new Card());
		client.platesteNota(200);
		client.setModPlata(new Cash());
		client.platesteNota(150);
	}
}
