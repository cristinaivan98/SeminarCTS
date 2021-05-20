package cts.ivan.cristina.g1081.pattern.factory;

public class Tutorial extends ClipVideo {
    public Tutorial(String denumire, int durata) {
        super(denumire, durata);
    }

    @Override
    public String toString() {
        return "Tutorial: "+super.getDenumire()+"-"+super.getDurata()+"minute";
    }
}
