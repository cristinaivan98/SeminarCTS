package ro.ase.cts.clase;

public class Meci {
    private String echipaGazda;
    private String echipaOaspete;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStewarzi;

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStewarzi(int nrStewarzi) {
        this.nrStewarzi = nrStewarzi;
    }

    @Override
    public String toString() {
        return "Meci{" +
                "echipaGazda='" + echipaGazda + '\'' +
                ", echipaOaspete='" + echipaOaspete + '\'' +
                ", nrBileteVandute=" + nrBileteVandute +
                ", nrSpectatori=" + nrSpectatori +
                ", nrJandarmi=" + nrJandarmi +
                ", nrStewarzi=" + nrStewarzi +
                '}';
    }

    public Meci(String echipaGazda, String echipaOaspete, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStewarzi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }public Memento creareMemento(){
        Memento memento=new Memento(this.nrSpectatori,this.echipaGazda,this.echipaOaspete);
        return memento;
    }

    public void seteazaMemento(Memento memento){
        this.echipaGazda=memento.getEchipaGazda();
        this.nrSpectatori=memento.getNrSpectatori();
        this.echipaOaspete=memento.getEchipaOaspete();

    }
}
