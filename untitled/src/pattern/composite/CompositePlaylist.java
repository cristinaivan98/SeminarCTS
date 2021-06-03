package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePlaylist implements IPlaylist{
    private List<IPlaylist> listaClipuri;

    public CompositePlaylist() {
        this.listaClipuri = new ArrayList<>();
    }

    @Override
    public void afiseazaVideoclip() throws Exception {
        System.out.println("Playlist: ");
        for(IPlaylist playlist:listaClipuri){
            playlist.afiseazaVideoclip();
        }
    }

    @Override
    public void adaugaVideoclip(IPlaylist playlist) throws Exception {
            listaClipuri.add(playlist);
    }

    @Override
    public void stergeVideoclip(IPlaylist playlist) throws Exception {
            listaClipuri.remove(playlist);
    }

    @Override
    public IPlaylist getNod(int pozitie) throws Exception {
        return listaClipuri.get(pozitie);
    }
}
