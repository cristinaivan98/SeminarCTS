package main;


import pattern.composite.CompositePlaylist;
import pattern.composite.LeafClip;
import pattern.decorator.Clip;
import pattern.decorator.DecoratorAbstract;
import pattern.decorator.DecoratorReclama;
import pattern.decorator.DecoratorReclamaPauza;
import pattern.factory.ClipVideo;
import pattern.factory.FactoryVideoclip;
import pattern.factory.TipVideoclip;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Testare factory");
        FactoryVideoclip factoryVideoclip=new FactoryVideoclip();
        ClipVideo tutorial1=factoryVideoclip.creareClipVideo(TipVideoclip.Tutorial,"Tutorial1",20);
        ClipVideo tutorial2=factoryVideoclip.creareClipVideo(TipVideoclip.Tutorial,"Tutorial2",30);
        ClipVideo clipLive =factoryVideoclip.creareClipVideo(TipVideoclip.Tutorial,"ClipLive1",40);
        ClipVideo clipLive2=factoryVideoclip.creareClipVideo(TipVideoclip.Tutorial,"ClipLive2",50);
        System.out.println(tutorial1);
        System.out.println(tutorial2);
        System.out.println(clipLive);
        System.out.println(clipLive2);
        System.out.println();
        System.out.println("Testare composite");
        CompositePlaylist playlist1=new CompositePlaylist();
        CompositePlaylist playlist2=new CompositePlaylist();
        CompositePlaylist playlist3=new CompositePlaylist();
        LeafClip clip1=new LeafClip("clip1",20,true);
        LeafClip clip2=new LeafClip("clip2",21,false);
        LeafClip clip3=new LeafClip("clip3",14,false);
        LeafClip clip4=new LeafClip("clip4",5,true);
        LeafClip clip5=new LeafClip("clip5",16,false);
        LeafClip clip6=new LeafClip("clip6",18,true);
        playlist1.adaugaVideoclip(clip1);
        playlist1.adaugaVideoclip(clip2);
        playlist1.afiseazaVideoclip();
        System.out.println();
        playlist2.adaugaVideoclip(clip3);
        playlist2.adaugaVideoclip(clip4);
        playlist3.adaugaVideoclip(clip5);
        playlist3.adaugaVideoclip(clip6);
        playlist3.adaugaVideoclip(playlist2);
        playlist3.afiseazaVideoclip();
        System.out.println();
        clip1.afiseazaVideoclip();
        System.out.println();
        System.out.println("Testare decorator");
        Clip clipInitial=new Clip("Clip1");
        clipInitial.start();
        clipInitial.pause();
        clipInitial.resume();
        clipInitial.stop();
        System.out.println();
        DecoratorAbstract decoratorAbstract=new DecoratorReclama(clipInitial,10);
        DecoratorAbstract decoratorAbstract2=new DecoratorReclamaPauza(clipInitial,5);
        decoratorAbstract.start();
        decoratorAbstract.pause();
        decoratorAbstract.resume();
        decoratorAbstract.stop();
        System.out.println();
        decoratorAbstract2.start();
        decoratorAbstract2.resume();
        decoratorAbstract2.resume();
        decoratorAbstract2.stop();
        DecoratorAbstract decoratorAbstract3=new DecoratorReclama(decoratorAbstract2,12);
        decoratorAbstract3.start();
        decoratorAbstract3.stop();
        decoratorAbstract3.resume();
        decoratorAbstract3.stop();






    }
}
