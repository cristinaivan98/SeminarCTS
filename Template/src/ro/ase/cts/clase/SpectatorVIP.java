package ro.ase.cts.clase;

public class SpectatorVIP extends SpectatorAbstract {
   public String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println(this.nume+" a avansat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(this.nume+ " a prezentat bilet VIP");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(this.nume+ " a fost controlat corporal pt locurile VIP");
    }

    @Override
    public void ocupaLocuri() {
        System.out.println(this.nume+" a ocupat locul VIP");
    }
}
