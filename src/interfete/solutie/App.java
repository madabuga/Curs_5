package interfete.solutie;

public class App {
    public static void main(String[] args) {
        RemoteControlled rc = new MasinaDeTest();

        MasinaDeTest masinaDeTest = new MasinaDeTest();

        Telecomanda telecomanda = new Telecomanda(masinaDeTest);

        telecomanda.apasButonInainte();
        telecomanda.apasButonInapoi();
        System.out.println();
        System.out.println();

        RemoteControlled rc2 = new Masina();
        Masina masina = new Masina();
        Telecomanda telecomanda2 = new Telecomanda(masina);
        telecomanda2.apasButonInapoi();
        telecomanda2.apasButonInainte();
    }
}
