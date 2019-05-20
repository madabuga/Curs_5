package interfete.solutie;

public class Telecomanda {
    private RemoteControlled remoteControlled;
    public Telecomanda(RemoteControlled remoteControlled){
        this.remoteControlled = remoteControlled;
    }

    public void apasButonInainte(){
        System.out.println("Apas buton inainte!");
        remoteControlled.mergiInainte();
    }

    public void apasButonInapoi(){
        System.out.println("Apas buton inapoi!");
        remoteControlled.mergiInapoi();
    }
}
