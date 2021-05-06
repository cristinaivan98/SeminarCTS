package ro.ase.cts.clase;

public class NotificatorSMS extends Notificator {

	@Override
	public void trimiteNotificare(Client client, String text) {
		// TODO Auto-generated method stub
		if(client.getNrTelefon()!=null) {
			System.out.println("Trimitere SMS catre "+client.getNume()+" mesaj: "+text);
		}else {
			if(super.getNotificator()!=null) {
				super.getNotificator().trimiteNotificare(client, text);
			}else {
				System.out.println("Domnule manager, nu avem date de contatc pentru clientul "+client.getNume());
			}
			
		}
	}

}
