package ro.ase.cts.clase;

public abstract class SpectatorAbstract {
    public abstract void seAseazaLaCoada();
    public abstract void prezentareBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLocuri();
    public final void intrareInStadion(){
        seAseazaLaCoada();
        prezentareBilet();
        realizareControlCorporal();
        ocupaLocuri();

    }
}
