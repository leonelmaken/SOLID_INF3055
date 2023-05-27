public class Vehicule {
    private float puissanceMoteur;

    public Vehicule(float puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public void démarrer(){
        System.out.println("Je démarre.");
    }

    public void freiner(){
        System.out.println("Je freine.");
    }
}
