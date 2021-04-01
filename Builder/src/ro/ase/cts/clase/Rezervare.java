package ro.ase.cts.clase;

public class Rezervare {
 private int codRezervare;
 private boolean areMancare;
 private boolean areScaunErgonomic;
 private boolean areBautura;
 private boolean areMuzicaAmbientala;
 private String genMuzica;
public Rezervare(int codRezervare, boolean areMancare, boolean areScaunErgonomic, boolean areBautura,
		boolean areMuzicaAmbientala, String genMuzica) {
	this.codRezervare = codRezervare;
	this.areMancare = areMancare;
	this.areScaunErgonomic = areScaunErgonomic;
	this.areBautura = areBautura;
	this.areMuzicaAmbientala = areMuzicaAmbientala;
	this.genMuzica = genMuzica;
}
public int getCodRezervare() {
	return codRezervare;
}
public void setCodRezervare(int codRezervare) {
	this.codRezervare = codRezervare;
}
public boolean isAreMancare() {
	return areMancare;
}
public void setAreMancare(boolean areMancare) {
	this.areMancare = areMancare;
}
public boolean isAreScaunErgonomic() {
	return areScaunErgonomic;
}
public void setAreScaunErgonomic(boolean areScaunErgonomic) {
	this.areScaunErgonomic = areScaunErgonomic;
}
public boolean isAreBautura() {
	return areBautura;
}
public void setAreBautura(boolean areBautura) {
	this.areBautura = areBautura;
}
public boolean isAreMuzicaAmbientala() {
	return areMuzicaAmbientala;
}
public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
	this.areMuzicaAmbientala = areMuzicaAmbientala;
}
public String getGenMuzica() {
	return genMuzica;
}
public void setGenMuzica(String genMuzica) {
	this.genMuzica = genMuzica;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Rezervare [codRezervare=");
	builder.append(codRezervare);
	builder.append(", areMancare=");
	builder.append(areMancare);
	builder.append(", areScaunErgonomic=");
	builder.append(areScaunErgonomic);
	builder.append(", areBautura=");
	builder.append(areBautura);
	builder.append(", areMuzicaAmbientala=");
	builder.append(areMuzicaAmbientala);
	builder.append(", genMuzica=");
	builder.append(genMuzica);
	builder.append("]");
	return builder.toString();
}

 
}
