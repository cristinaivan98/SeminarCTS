package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> listaMemento;

    public ManagerMemento() {
        this.listaMemento = new ArrayList<>();
    }
    public void adaugaMemento(Memento memento){
        listaMemento.add(memento);
    }
    public Memento cereMemento(int index){
        if(index<listaMemento.size()){
            return listaMemento.get(index);
        }else return null;

    }
    public Memento cereUtlimulMemento(){
        return listaMemento.get(listaMemento.size());
    }
}
