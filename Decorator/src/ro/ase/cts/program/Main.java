package ro.ase.cts.program;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.clase.DecoratorUrarePaste;
import ro.ase.cts.clase.NotaDePlata;

public class Main {
public static void main(String[] args) {
	NotaDePlata notaInitiala=new NotaDePlata(55);
	notaInitiala.printeazaNota();
	
	DecoratorAbstract decoratorLaMultiAni=new DecoratorCuLaMultiAni(notaInitiala);
	decoratorLaMultiAni.printeazaNota();
	System.out.println();
	decoratorLaMultiAni.printeazaNota();
	
	DecoratorAbstract decoratorUrarePaste=new DecoratorUrarePaste(notaInitiala);
	decoratorUrarePaste.printeazaNota();
	
	NotaDePlata notaDePlata=new NotaDePlata(150);
	DecoratorAbstract decoratorLaMultiAni2=new DecoratorCuLaMultiAni(notaDePlata);
	DecoratorAbstract decoratorUrarePaste2=new DecoratorUrarePaste(decoratorLaMultiAni2);
	decoratorUrarePaste2.printeazaNota();
}
}
