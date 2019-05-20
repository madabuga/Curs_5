package interfete.prefata;

public class Telecomanda {
    private Masina masina;

    public Telecomanda(Masina masina){
        this.masina = masina;
    }

    public void apasButonInainte(){
        System.out.println("Apas buton inainte!");
        masina.mergiInainte();
    }

    public void apasButonInapoi(){
        System.out.println("Apas buton inapoi!");
        masina.mergiInapoi();
    }

}
