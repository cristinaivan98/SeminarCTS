package cts.ivan.cristina.g1081.pattern.factory;

public abstract class ClipVideo implements IClip {
    private String denumire;
    private int durata;

    public ClipVideo(String denumire, int durata) {
        this.denumire = denumire;
        this.durata = durata;
    }

    @Override
    public void pause() {
        System.out.println("Pauza");
    }

    @Override
    public void stop() {
        System.out.println("Videoclip oprit");
    }

    @Override
    public void resume() {
        System.out.println("Porneste din nou");
    }

    @Override
    public void start() {
        System.out.println("Porneste video");
    }

    public String getDenumire() {
        return denumire;
    }

    public int getDurata() {
        return durata;
    }
}
