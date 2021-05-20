package cts.ivan.cristina.g1081.pattern.decorator;

public class Clip implements IClip {
    private String denumireVideoclip;

    public Clip(String denumireVideoclip) {
        this.denumireVideoclip = denumireVideoclip;
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
        System.out.println("Clipul a fost reluat ");
    }

    @Override
    public void start() {
        System.out.println("Clipul a fost pornit");
    }
}
