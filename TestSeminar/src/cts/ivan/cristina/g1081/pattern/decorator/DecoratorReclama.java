package cts.ivan.cristina.g1081.pattern.decorator;

public class DecoratorReclama extends DecoratorAbstract{
    private int durataReclama;
    public DecoratorReclama(IClip actiuniClip,int durataReclama) {
        super(actiuniClip);
        this.durataReclama=durataReclama;
    }

    @Override
    public void start() {
        System.out.println("A inceput o reclama de "+this.durataReclama+" secunde");


    }

    @Override
    public void pause() {
        System.out.println("Clipul a fost pus pe pauza");
    }

    @Override
    public void stop() {
        System.out.println("Clipul a fost oprit");
    }

    @Override
    public void resume() {
        System.out.println("Clipul a fost reluat");
    }
}
