package interfete.prefata;

public class App {
    public static void main(String[] args) {
        Masina masina = new Masina();
        Telecomanda telecomanda = new Telecomanda(masina);

        telecomanda.apasButonInainte();
        telecomanda.apasButonInapoi();

    }
}
