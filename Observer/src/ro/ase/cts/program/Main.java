package ro.ase.cts.program;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Manager;

public class Main {
    public static void main(String[] args){
        Manager manager=new Manager();
        Client client1=new Client("Cristina");
        Client client2=new Client("Ivan ");
        Client client3=new Client("Stefania");

        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);
        manager.anuntaMeci("handbal");

        manager.stergeObservator(client3);
        manager.anuntaMeci("volei");


    }
}
