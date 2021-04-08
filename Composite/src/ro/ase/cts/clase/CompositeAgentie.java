package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeAgentie implements ISediu{
	private List<ISediu> listaSedii;
	
	public CompositeAgentie() {
		super();
		this.listaSedii = new ArrayList<ISediu>();
	}

	public void afiseazaDescriere() {
		System.out.println("Este o agentie");
		for(ISediu sediu:listaSedii) {
			sediu.afiseazaDescriere();
		}
		
	}

	@Override
	public void addNod(ISediu sediu) {
		listaSedii.add(sediu);
		
	}

	@Override
	public void removeNod(ISediu sediu) {
		listaSedii.remove(sediu);
		
	}

	@Override
	public ISediu getNod(int pozitie) {
		// TODO Auto-generated method stub
		return listaSedii.get(pozitie);
	}

}
