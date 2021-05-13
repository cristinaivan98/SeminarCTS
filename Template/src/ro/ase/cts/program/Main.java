package ro.ase.cts.program;

import ro.ase.cts.clase.Spectator;
import ro.ase.cts.clase.SpectatorAbstract;
import ro.ase.cts.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args){
        SpectatorAbstract spectator1=new Spectator("Nuti");
        SpectatorAbstract spectatorVIP=new SpectatorVIP("Cristina Ivan");
        spectator1.intrareInStadion();
        spectatorVIP.intrareInStadion();
    }
}
