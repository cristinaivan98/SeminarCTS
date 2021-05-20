package cts.ivan.cristina.g1081.pattern.composite;

public interface IPlaylist {
    public void afiseazaVideoclip() throws Exception;
    public void adaugaVideoclip(IPlaylist playlist) throws Exception;
    public void stergeVideoclip(IPlaylist playlist) throws Exception;
    public IPlaylist getNod(int pozitie) throws Exception;
}
