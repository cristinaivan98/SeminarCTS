package pattern.decorator;

public class DecoratorReclamaPauza extends DecoratorAbstract {
    private int durataReclama;
    public DecoratorReclamaPauza(IClip actiuniClip,int durataReclama) {
        super(actiuniClip);
        this.durataReclama=durataReclama;

    }

    @Override
    public void resume() {
        System.out.println("Inainte de reluare clipul a inceput o reclama de "+this.durataReclama);
    }
    @Override
    public void start() {
        System.out.println("Clipul a pornit");


    }

    @Override
    public void pause() {
        System.out.println("Clipul a fost pus pe pauza");
    }

    @Override
    public void stop() {
        System.out.println("Clipul a fost oprit");
    }
}
