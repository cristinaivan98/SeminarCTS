package ro.ase.cts.clase;

public class Spectator extends SpectatorAbstract {
   public String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println(this.nume+" s a asezat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(this.nume+" prezinta biletul");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(this.nume+" este verificat corporal");
    }

    @Override
    public void ocupaLocuri() {
        System.out.println(this.nume+ " a ocupat locul");
    }
}
