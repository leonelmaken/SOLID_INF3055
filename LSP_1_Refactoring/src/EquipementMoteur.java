public class EquipementMoteur {
    private float puissanceMoteur;

    public EquipementMoteur(float puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public void démarrer(){
        System.out.println("Je démarre.");
    }

    public void freiner(){
        System.out.println("Je freine.");
    }
}
