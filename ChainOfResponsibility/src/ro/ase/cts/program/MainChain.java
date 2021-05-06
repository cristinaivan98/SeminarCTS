package ro.ase.cts.program;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.NotificatorEmail;
import ro.ase.cts.clase.NotificatorSMS;

public class MainChain {
	public static void main(String[] args) {
		Client client1=new Client("Cristina",null,null);
		Client client2=new Client("Stefania","0764789142",null);
		Client client3=new Client("Ivan",null,"ivan@yahoo.com");
		
		NotificatorSMS notificatorSMS=new NotificatorSMS();
		NotificatorEmail notificatorEmail=new NotificatorEmail();
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client3, "Mesaj 1");
	}
}
