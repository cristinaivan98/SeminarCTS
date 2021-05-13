package ro.ase.cts.clase;

public class Manager extends ManagerSalaDeSport{
    public void anuntaMeci(String tipSport){
        super.notificaObservator("Va avea loc un meci de "+tipSport);
    }


}
