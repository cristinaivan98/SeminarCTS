package ro.ase.cts.clase;

public class Client implements Observator{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Clientul "+this.nume+" a primit mesajul "+mesaj);
    }
}
