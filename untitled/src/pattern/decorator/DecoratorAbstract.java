package pattern.decorator;

public abstract class DecoratorAbstract implements IClip {
    IClip actiuniClip;

    public DecoratorAbstract(IClip actiuniClip) {
        this.actiuniClip = actiuniClip;
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
