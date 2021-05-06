package ro.ase.cts.clase;

public class NotificatorEmail extends Notificator{

	@Override
	public void trimiteNotificare(Client client, String text) {
		if(client.getEmail()!=null) {
			System.out.println("Trimitem email catre clientul "+client.getNume()+"mesaj: "+text);
			
		}else {
			if(super.getNotificator()!=null) {
				super.getNotificator().trimiteNotificare(client, text);
			}else {
				System.out.println("Domnule manager, nu avem date de contact pentru clientul "+client.getNume());
			}
		}
		
	}

}
