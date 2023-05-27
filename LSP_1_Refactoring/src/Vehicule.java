public class Vehicule {
    private String typeEnergie;
    private EquipementMoteur equipementMoteur;

    public Vehicule(String typeEnergie, EquipementMoteur equipementMoteur) {
        this.typeEnergie = typeEnergie;
        this.equipementMoteur = equipementMoteur;
    }

    public EquipementMoteur getEquipementMoteur() {
        return equipementMoteur;
    }

    public String getTypeEnergie() {
        return typeEnergie;
    }

    public void calculerConso(){
        System.out.println("Calcul de la consommation.");
    }
}
