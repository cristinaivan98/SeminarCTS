package cts.ivan.cristina.g1081.pattern.factory;

public class FactoryVideoclip {
    public ClipVideo creareClipVideo(TipVideoclip tip,String denumire,int durata){
        switch(tip){
            case ClipLive:
                return new ClipLive(denumire,durata);
            case Tutorial:
                return new Tutorial(denumire,durata);
            default:
                throw new IllegalArgumentException();
        }
    }
}
