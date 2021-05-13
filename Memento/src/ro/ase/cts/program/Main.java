package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerMemento;
import ro.ase.cts.clase.Meci;

public class Main {
    public static void main(String[] args){
        Meci meci=new Meci("Gazda","Oaspeti",200,189,10,5);
        ManagerMemento managerMemento=new ManagerMemento();

        meci.setNrSpectatori(100);

        System.out.println(meci.toString());
        managerMemento.adaugaMemento(meci.creareMemento());

        System.out.println(meci);

        meci.seteazaMemento(managerMemento.cereUtlimulMemento());
        System.out.println(meci);
    }
}
