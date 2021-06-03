package pattern.composite;

public class LeafClip implements IPlaylist, IClip{
    private String denumire;
    private int durata;
    private boolean aFostVizionat;

    public LeafClip(String denumire, int durata, boolean aFostVizionat) {
        this.denumire = denumire;
        this.durata = durata;
        this.aFostVizionat = aFostVizionat;
    }

    @Override
    public void afiseazaVideoclip()  {
        System.out.println("Este un clip"+denumire+"-"+durata+"-"+aFostVizionat);
    }

    @Override
    public void adaugaVideoclip(IPlaylist playlist) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeVideoclip(IPlaylist playlist) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public IPlaylist getNod(int pozitie) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void start() {

    }
}
