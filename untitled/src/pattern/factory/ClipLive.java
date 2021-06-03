package pattern.factory;

public class ClipLive extends ClipVideo {
    public ClipLive(String denumire, int durata) {
        super(denumire, durata);
    }

    @Override
    public String toString() {
        return "ClipLive: "+super.getDenumire()+"-"+super.getDurata()+"minute";
    }
}
